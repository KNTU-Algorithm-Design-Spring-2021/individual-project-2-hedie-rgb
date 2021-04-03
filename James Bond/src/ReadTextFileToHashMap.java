import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class ReadTextFileToHashMap {

    final static String filePath = ".\\EnglsihWords";

    public static Map<String, Integer> getHashMapFromTextFile(){

        Map<String, Integer> mapFileContents = new HashMap<String, Integer>();
        BufferedReader br = null;

        try{

            File file = new File(filePath);

            br = new BufferedReader( new FileReader(file) );

            String line = null;

            int i = 0;
            while ( (line = br.readLine()) != null ){

                String name = line.toString();

                if( !name.equals(""))
                    mapFileContents.put(name, i);
                i++;
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally{

            if(br != null){
                try {
                    br.close();
                }catch(Exception ignored){};
            }
        }

        return mapFileContents;

    }
}