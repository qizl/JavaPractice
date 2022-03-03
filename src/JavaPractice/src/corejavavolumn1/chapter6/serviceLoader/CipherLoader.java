package corejavavolumn1.chapter6.serviceLoader;

import java.util.Optional;
import java.util.ServiceLoader;

/**
 * description: add a description
 *
 * @author Qizl
 * @version 1.0.0
 * @since 2022/03/03 11:31:45
 */
public class CipherLoader {

    public static ServiceLoader<Cipher> cipherLoader = ServiceLoader.load(Cipher.class);

    public static Cipher getCipher(int minStrength) {
        for (Cipher cipher : cipherLoader) {
            if (cipher.strength() >= minStrength)
                return cipher;
        }
        return null;
    }

    public static Optional<Cipher> getCipher2() {
        return cipherLoader.stream()
                .filter(descr -> descr.type() == corejavavolumn1.chapter6.serviceLoader.impl.CaesarCipher.class)
                .findFirst()
                .map(ServiceLoader.Provider::get);
    }

    public static void test() {
        Optional<Cipher> cipher = cipherLoader.findFirst();

        Cipher cipher1 = getCipher(1);
        var strength = cipher1.strength();
    }
}
