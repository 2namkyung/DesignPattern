package facade;

public class Main {

    public static void main(String[] args) {

        Ftp ftpClient = new Ftp("www.test.co.kr", 22, "/home/etc");
        ftpClient.connect();
        ftpClient.moveDirectory();

        Writer writer = new Writer("text.tmp");
        writer.fileConnect();
        writer.fileWrite();

        Reader reader = new Reader("text.tmp");
        reader.fileConnect();
        reader.fileRead();

        ftpClient.disConnect();
        writer.fileDisconnect();
        reader.fileDisconnect();

        System.out.println("-----------Using Facade--------------");

        Facade facade = new Facade("www.test.co.kr", 22, "/home/etc", "text.tmp");
        facade.connect();

        facade.write();
        facade.read();

        facade.disConnect();
    }
}
