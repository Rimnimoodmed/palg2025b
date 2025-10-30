package palg.Cviko05_Uloha01;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        // Přečti soubor 5fb2a3cb-51c5-4574-9e85-783745fa59d2.txt
        // a vypiš pro každou zaznamenanou IP adresu
        // kolik bytů bylo na ni celkem odesláno

        Path path = Paths.get(System.getProperty("user.dir"),"input","5fb2a3cb-51c5-4574-9e85-783745fa59d2.txt");
        var lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        HashMap<String,Long> hashMap = new HashMap<>();
        for (var line : lines) {
            var parts = line.split(";");
            var ip = parts[0];
            var bytes = Integer.parseInt(parts[1].replace(" ", ""));
            var current = hashMap.getOrDefault(ip, 0l);
            hashMap.put(ip, current+bytes);
            
        }
        for (var entry : hashMap.keySet()) {
                System.out.println(entry+": "+hashMap.get(entry));
            }
    }
}
