package util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatadorData {

    public java.sql.Date converterDataParaDate(Date data) throws Exception {

        SimpleDateFormat formatarDate = new SimpleDateFormat("dd/MM/yyyy");

        String dataString = formatarDate.format(data);

        if (data == null || data.equals("")) {
            return null;
        }

        java.sql.Date date = null;

        try {
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            date = new java.sql.Date(((java.util.Date) formatter.parse(dataString)).getTime());
        } catch (ParseException e) {
            throw e;
        }
        return date;
    }
}
