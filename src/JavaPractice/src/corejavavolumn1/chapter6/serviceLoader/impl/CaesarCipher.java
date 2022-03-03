package corejavavolumn1.chapter6.serviceLoader.impl;

import corejavavolumn1.chapter6.serviceLoader.Cipher;

/**
 * description: add a description
 *
 * @author Qizl
 * @version 1.0.0
 * @since 2022/03/03 11:26:28
 */
public class CaesarCipher implements Cipher {
    @Override
    public byte[] encrypt(byte[] source, byte[] key) {
        var result = new byte[source.length];
        for (int i = 0; i < source.length; i++)
            result[i] = (byte) (source[i] + key[0]);
        return result;
    }

    @Override
    public byte[] decrypt(byte[] source, byte[] key) {
        return encrypt(source, new byte[]{(byte) -key[0]});
    }

    @Override
    public int strength() {
        return 1;
    }
}
