import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

//        Date


        String dateString = "35/09/2018 35:00";
        Date now = new Date();
        Date strDate = null;
        try {
             strDate = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(strDate);


    }
}

