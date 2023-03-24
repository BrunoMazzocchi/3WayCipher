# 3WayCipher
The 3-Way cipher algorithm is a block cipher that is used for symmetric encryption. It is designed to provide high levels
of security and uses a combination of substitution and permutation operations to encrypt data. The 3-Way cipher algorithm 
can be implemented in Java using the Jasypt library, which provides a simplified interface for encryption and decryption.

## Implementation  
To implement the 3-Way cipher algorithm with the Jasypt library, you can first create an instance of the 
StandardPBEByteEncryptor class, which is a class that provides encryption and decryption functionality.
Once the instance is created, you can set the password and algorithm using the setPassword and setAlgorithm methods, 
respectively. The password is used to derive the encryption key, which is then used to encrypt and decrypt the data.
After the password and algorithm are set, you can call the encrypt and decrypt methods to encrypt and decrypt the data, 
respectively.

### Jasypt library 
The Jasypt library provides a convenient way to use the 3-Way cipher algorithm in Java. It allows developers 
to easily encrypt and decrypt data using this strong encryption algorithm without having to worry about the underlying 
details of the algorithm. It is important to note that a strong and secure password should always be used to ensure that 
the encrypted data is protected from unauthorized access.
