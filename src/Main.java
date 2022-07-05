import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    static void fileDir(String path) {
        StringBuilder log = new StringBuilder();
        File dirSrc = new File(path);
        if (dirSrc.mkdir())
            System.out.println("Каталог " + path + " создан");
        log.append("Каталог " + path + " создан");
        log.append('\n');

        String text = log.toString();
        try (FileWriter writer = new FileWriter("C:\\Users\\Masha\\Desktop\\GamesNet\\temp\\temp.txt", true)) {
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void newFile(String pathFile, String nameChild) {
        StringBuilder Log = new StringBuilder();
        File fileMain = new File(pathFile, nameChild);
        try {
            if (fileMain.createNewFile())
                System.out.println("Файл " + nameChild + " был создан");
            Log.append("Файл " + nameChild + " был создан");
            Log.append('\n');
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        String text = Log.toString();
        try (FileWriter writer = new FileWriter("C:\\Users\\Masha\\Desktop\\GamesNet\\temp\\temp.txt", true)) {
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


    public static void main(String[] args) {

        fileDir("C:\\Users\\Masha\\Desktop\\GamesNet\\temp");
        newFile("C:\\Users\\Masha\\Desktop\\GamesNet\\temp", "temp.txt");
        fileDir("C:\\Users\\Masha\\Desktop\\GamesNet\\src");
        fileDir("C:\\Users\\Masha\\Desktop\\GamesNet\\src\\main");
        newFile("C:\\Users\\Masha\\Desktop\\GamesNet\\src\\main", "Main.java");
        newFile("C:\\Users\\Masha\\Desktop\\GamesNet\\src\\main", "Utils.java");
        fileDir("C:\\Users\\Masha\\Desktop\\GamesNet\\src\\test");
        fileDir("C:\\Users\\Masha\\Desktop\\GamesNet\\res");
        fileDir("C:\\Users\\Masha\\Desktop\\GamesNet\\savegames");
        fileDir("C:\\Users\\Masha\\Desktop\\GamesNet\\res\\drawables");
        fileDir("C:\\Users\\Masha\\Desktop\\GamesNet\\res\\vectors");
        fileDir("C:\\Users\\Masha\\Desktop\\GamesNet\\res\\icons");

    }

}

