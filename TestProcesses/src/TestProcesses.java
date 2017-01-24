/*
 * Kills the process given to method parameter. "chrome.exe"
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.StringTokenizer;


/**
 *
 * @author tpaulson
 */
public class TestProcesses
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //specify process name to kill*************
        // "iexplore.exe", "chrome.exe"
        
            processKiller("chrome.exe");
        



    }//end main()
    
    
    public static void processKiller(String processToKill){
    
        try
        {
            String line;
            
            Process p = Runtime.getRuntime().exec(System.getenv("windir") + "\\system32\\" + "tasklist.exe /fo csv /nh");

            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((line = input.readLine()) != null)
            {
//************************************************************************************************
                //specify process name to kill*************
                // "iexplore.exe", "chrome.exe"
                String processName = processToKill;
//*************************************************************************************************
                if (line.contains(processName))
                {

                    //System.out.println(line); //<-- Parse data here.
                    
                    Runtime.getRuntime().exec("taskkill /F /IM " + processName);
                    
                }//end if

            }//end while
            input.close();
        } catch (Exception err)
        {
            err.printStackTrace();
        }//end catchp
        
    
    }//end method processKiller
    
    

}//end class TestProcesses

