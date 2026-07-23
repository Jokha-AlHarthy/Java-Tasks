public class FilePathSplitter {
    public static void main(String[] args){
        //Read a full path with a Scanner (for example, C:\Users\Ali\report.pdf or /home/ali/report.pdf)
        IO.println("Please enter the full path of your file");
        String filePath = IO.readln();

        //If it is blank, print "Invalid path." and stop.
        if(filePath.isBlank()){
            IO.println("Invalid path");
        }

        //check whether the path has a backslash, then replace every backslash '\' with '/'
        boolean hasBackslash = filePath.contains("\\");
        String replaceBackslash = filePath.replace("\\", "/");

        //Get the folder and file name
        int lastSlash = replaceBackslash.lastIndexOf('/');
        String folder = "";
        String fileName = "";
        if (lastSlash != -1) {
            folder = replaceBackslash.substring(0, lastSlash);
            fileName = replaceBackslash.substring(lastSlash + 1);
        } else {
            folder = "None";
            fileName = replaceBackslash;
        }

        //Get the extension using the last dot in the file
        int lastDot = fileName.lastIndexOf('.');
        String extension = "";
        if(lastDot != -1){
            extension = fileName.substring(lastDot + 1);
        }else{
            extension = "none";
        }

        //Decide the path style whether it's Windows or Unix
        String pathStyle = "";
        if(hasBackslash){
            pathStyle = "Windows Path";
        }else{
            pathStyle = "Unix Path";
        }


        //print the details
        IO.println("The path of the file is: "+filePath);
        IO.println("The folder is: "+folder);
        IO.println("The file name is: "+fileName);
        IO.println("The extension of the file is: "+extension);
        IO.println("The path style is: "+pathStyle);
    }
}
