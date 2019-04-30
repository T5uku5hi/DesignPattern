package composite;

import org.junit.jupiter.api.Test;

class CompositeTest {

    @Test
    void test() {
        try {
            System.out.println("Making root entries ...");
            Directory rootDir = new Directory("root");
            Directory binDir = new Directory("bin");
            Directory tmpDir = new Directory("tmp");
            Directory usrDir = new Directory("usr");
            rootDir.add(binDir);
            rootDir.add(tmpDir);
            rootDir.add(usrDir);
            binDir.add(new File("vi", 10000));
            binDir.add(new File("latex", 20000));
            rootDir.printList();

            System.out.println(" ");
            System.out.println("Making user entries ...");
            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            Directory tomura = new Directory("tomura");
            usrDir.add(yuki);
            usrDir.add(hanako);
            usrDir.add(tomura);
            yuki.add(new File("diary.html", 100));
            yuki.add(new File("Composite.java", 200));
            hanako.add(new File("memo.tex", 300));
            tomura.add(new File("game.doc", 400));
            tomura.add(new File("junk.mail", 500));
            rootDir.printList();
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }

    @Test
    void fullNameTest() {
        try {
            Directory rootDir = new Directory("root");

            Directory usrDir = new Directory("usr");
            rootDir.add(usrDir);

            Directory yuki = new Directory("yuki");
            usrDir.add(yuki);

            File file = new File("Composite.java", 100);
            yuki.add(file);
            rootDir.printList();

            System.out.println(" ");
            System.out.println("file = " + file.getFullName());
            System.out.println("yuki = " + yuki.getFullName());
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}