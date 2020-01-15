# 装饰者模式
动态地将责任附加到对象上。

想要扩展功能，装饰者提供有别于继承的另一种选择。



FileInputStream作为InputStream的具体组件，打开了一个与实际文件的连接，在read的时候读入输入流

FileInputStream本身是没有存储读入输入流数据的，只有与文件的连接，read()时即时输入

BufferedInputStream作为FileterInputStream的具体修饰者，将InputStream进行加工，加入了byte[] buf，将数据的输入流存储在了字节数组中，所以使用时更快