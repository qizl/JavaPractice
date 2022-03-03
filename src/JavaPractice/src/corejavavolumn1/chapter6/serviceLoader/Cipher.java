package corejavavolumn1.chapter6.serviceLoader;

/**
 * description: add a description
 *
 * @author Qizl
 * @version 1.0.0
 * @since 2022/03/03 11:24:50
 */
public interface Cipher {
    byte[] encrypt(byte[] source, byte[] key);

    byte[] decrypt(byte[] source, byte[] key);

    int strength();
}
