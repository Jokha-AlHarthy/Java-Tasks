public class FileNameAnalyzer {
    public static void main(String[] args){
        //Read a file name from the user with a Scanner (for example, report.final.pdf).
        String file = IO.readln("Please enter file name: ").strip();

        //If it is blank, has no dot, or the dot is first or last, print "Invalid file name." and stop
        int dotIndex = file.lastIndexOf('.');
        if (file.isBlank() || dotIndex<=0 || dotIndex == file.length() - 1){
            IO.println("Invalid file name");
        }

        String baseName = file.substring(0, dotIndex);
        String extension = file.substring(dotIndex + 1).toLowerCase();
        String classification;

        //Classify by extension
        if(extension.equals("txt") || extension.equals("pdf") || extension.equals("docx")){
            classification = "Document";
        } else if (extension.equals("jpg") || extension.equals("png")  || extension.equals("gif")) {
            classification = "Image";
        } else if (extension.equals("mp3")  || extension.equals("wav") ) {
            classification = "Audio";
        } else{
            classification = "Other";
        }

        //print the details
        IO.println("File name is: "+ file);
        IO.println("Base name is "+baseName);
        IO.println("Extension is: "+extension);
        IO.println("Classification of file is: "+classification);
    }
}
