/**
 *
 *  @author Faron Daniel PD3748
 *
 */

package zad4;


public class NumTeller {

    public static String say(int numb) {
        String msg = numb + "-";

        if (numb < 0) numb = -numb;

        if (numb % 10 == 0) {

            if (numb == 0)
                msg += "owy";

            else if (numb % 1000000 == 0)
                msg += "owy";

            else if (numb % 1000 == 0)
                msg += "ny";

            else if (numb % 100 == 0)
                msg += "ny";

            else msg += "ty";
        } else if (numb % 10 == 1) {

            if (numb % 100 == 11)
                msg += "ty";

            else msg += "szy";
        } else if (numb % 10 == 2) {

            if (numb % 100 == 2)
                msg += "gi";

            else msg += "gi";
        } else if (numb % 10 == 3) {

            if (numb % 100 == 13)
                msg += "ty";
            else msg += "ci";
        }

        else if (numb % 10 == 4) {
            msg += "ty";
        }

        else if (numb % 10 == 5) {
            msg += "ty";
        }

        else if (numb % 10 == 6) {
            msg += "ty";
        }

        else if (numb % 10 == 7) {
            if (numb % 100 == 7)
                msg += "ty";
            else msg += "my";
        }

        else if (numb % 10 == 8) {
            if (numb % 100 == 8)
                msg += "ty";
            else msg += "my";
        }

        else if (numb % 10 == 9) {
            msg += "ty";
        }

        return msg;
    }
}