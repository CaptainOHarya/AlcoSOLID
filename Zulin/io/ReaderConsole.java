package SOLID.Zulin.io;

/**
 * @author Leonid Zulin
 * @date 19.09.2022 20:12
 */
import java.util.Scanner;

public class ReaderConsole implements IReader {
    private Scanner scanner;

    public ReaderConsole(Scanner scanner) {
        this.scanner = scanner;
    }


    @Override
    public int read() {
        return scanner.nextInt();

    }

}
