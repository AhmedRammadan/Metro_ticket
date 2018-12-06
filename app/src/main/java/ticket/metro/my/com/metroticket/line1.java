package ticket.metro.my.com.metroticket;



public class line1 {
    public static int stpStart,stpEnd,resualt,price,image,tickettyp=1,resualt2;
    public static String tahwel;


    public static int getResualt(){
        if (stpStart>stpEnd)
            resualt=stpStart-stpEnd+1;
        else if (stpStart<stpEnd)
            resualt=stpEnd-stpStart+1;
        else if (stpStart==stpEnd){
            resualt=1;
        }
        return resualt;
    }
    public static int getPrice(){
        if (tickettyp==1)
        {switch (resualt) {
            case 0:
                price =3;
            case 1:
                price =3;
                break;
            case 2:
                price =3;
                break;
            case 3:
                price =3;
                break;
            case 4:
                price =3;
                break;
            case 5:
                price =3;
                break;
            case 6:
                price =3;
                break;
            case 7:
                price =3;
                break;
            case 8:
                price =3;
                break;
            case 9:
                price =3;
                break;
            case 10:
                price =5;
                break;
            case 11:
                price =5;
                break;
            case 12:
                price =5;
                break;
            case 13:
                price =5;
                break;
            case 14:
                price =5;
                break;
            case 15:
                price =5;
                break;
            case 16:
                price =5;
                break;
            default:
                price = 7;
                break;
        }
        }else if (tickettyp==2){
            switch (resualt) {
                case 0:
                    price =2;
                case 1:
                    price =2;
                    break;
                case 2:
                    price =2;
                    break;
                case 3:
                    price =2;
                    break;
                case 4:
                    price =2;
                    break;
                case 5:
                    price =2;
                    break;
                case 6:
                    price =2;
                    break;
                case 7:
                    price =2;
                    break;
                case 8:
                    price =2;
                    break;
                case 9:
                    price =2;
                    break;
                case 10:
                    price =4;
                    break;
                case 11:
                    price =4;
                    break;
                case 12:
                    price =4;
                    break;
                case 13:
                    price =4;
                    break;
                case 14:
                    price =4;
                    break;
                case 15:
                    price =4;
                    break;
                case 16:
                    price =4;
                    break;
                default:
                    price = 6;
                    break;
            }
        }else {
            price = 3;
        }
        return price;
    }
    public static int getImage(){
        if (tickettyp==1) {
            switch (resualt) {
                case 1:
                    get_ticket.price.setText("3");
                    get_ticket.ticket.setText("09");
                    break;
                case 2:
                    get_ticket.price.setText("3");
                    get_ticket.ticket.setText("09");
                    break;
                case 3:
                    get_ticket.price.setText("3");
                    get_ticket.ticket.setText("09");
                    break;
                case 4:
                    get_ticket.price.setText("3");
                    get_ticket.ticket.setText("09");
                    ;
                    break;
                case 5:
                    get_ticket.price.setText("3");
                    get_ticket.ticket.setText("09");
                    break;
                case 6:
                    get_ticket.price.setText("3");
                    get_ticket.ticket.setText("09");
                    break;
                case 7:
                    get_ticket.price.setText("3");
                    get_ticket.ticket.setText("09");
                    break;
                case 8:
                    get_ticket.price.setText("3");
                    get_ticket.ticket.setText("09");
                    break;
                case 9:
                    get_ticket.price.setText("3");
                    get_ticket.ticket.setText("09");
                    break;
                case 10:
                    get_ticket.price.setText("5");
                    get_ticket.ticket.setText("16");
                    break;
                case 11:
                    get_ticket.price.setText("5");
                    get_ticket.ticket.setText("16");
                    break;
                case 12:
                    get_ticket.price.setText("5");
                    get_ticket.ticket.setText("16");
                    break;
                case 13:
                    get_ticket.price.setText("5");
                    get_ticket.ticket.setText("16");
                    break;
                case 14:
                    get_ticket.price.setText("5");
                    get_ticket.ticket.setText("16");
                    break;
                case 15:
                    get_ticket.price.setText("5");
                    get_ticket.ticket.setText("16");
                    break;
                case 16:
                    get_ticket.price.setText("5");
                    get_ticket.ticket.setText("16");
                    break;
                default:
                    get_ticket.price.setText("7");
                    get_ticket.ticket.setText("37");
                    break;
            }
        }else if (tickettyp==2){
            switch (resualt) {
                case 1:

                    get_ticket.price.setText("2");
                    get_ticket.ticket.setText("09");
                    break;
                case 2:

                    get_ticket.price.setText("2");
                    get_ticket.ticket.setText("09");
                    break;
                case 3:

                    get_ticket.price.setText("2");
                    get_ticket.ticket.setText("09");
                    break;
                case 4:

                    get_ticket.price.setText("2");
                    get_ticket.ticket.setText("09");
                    ;
                    break;
                case 5:

                    get_ticket.price.setText("2");
                    get_ticket.ticket.setText("09");
                    break;
                case 6:

                    get_ticket.price.setText("2");
                    get_ticket.ticket.setText("09");
                    break;
                case 7:

                    get_ticket.price.setText("2");
                    get_ticket.ticket.setText("09");
                    break;
                case 8:

                    get_ticket.price.setText("2");
                    get_ticket.ticket.setText("09");
                    break;
                case 9:

                    get_ticket.price.setText("2");
                    get_ticket.ticket.setText("09");
                    break;
                case 10:
                    get_ticket.price.setText("4");
                    get_ticket.ticket.setText("16");
                    break;
                case 11:
                    get_ticket.price.setText("4");
                    get_ticket.ticket.setText("16");
                    break;
                case 12:
                    get_ticket.price.setText("4");
                    get_ticket.ticket.setText("16");
                    break;
                case 13:
                    get_ticket.price.setText("4");
                    get_ticket.ticket.setText("16");
                    break;
                case 14:
                    get_ticket.price.setText("4");
                    get_ticket.ticket.setText("16");
                    break;
                case 15:
                    get_ticket.price.setText("4");
                    get_ticket.ticket.setText("16");
                    break;
                case 16:
                    get_ticket.price.setText("4");
                    get_ticket.ticket.setText("16");
                    break;
                default:
                    get_ticket.price.setText("5");
                    get_ticket.ticket.setText("37");
                    break;
            }
        }else {
            get_ticket.price.setText("3");
            get_ticket.ticket.setText("09");
        }
        return image;
    }

    public static int getResualt2(){

        if (ticket.get_position1==0){
            if (stpStart <= 20) {
                tahwel = "a";
                if (stpStart > 19) {
                    resualt2 = (stpStart - 19) + stpEnd;
                } else if (stpStart < 19) {
                    resualt2 = (19 - stpStart) + stpEnd;
                } else if (stpStart == 19) {
                    resualt2 = getstart();
                }
            }else if (stpStart >= 20) {
                tahwel = "aa";
                if (stpStart == 22) {
                    resualt2 = getstart();
                } else if (stpStart > 22) {
                    resualt2 = (stpStart - 22) + stpEnd;
                } else if (stpStart == 21) {
                    resualt2 = (22 - stpStart) + stpEnd;
                }
            }
        }else if (ticket.get_position1==1){
            if (ticket.get_position2==0){
                if (stpStart<=11){
                    tahwel = "a";
                    if (stpStart<10){
                        resualt2=10-stpStart+stpEnd;
                    } else if (stpStart>10){
                        resualt2=stpStart-10+stpEnd;
                    }else if (stpStart==10){
                        resualt2=getstart();
                    }

                }
                else if (stpStart>=12) {
                    tahwel = "aa";
                    if (stpStart == 13) {
                        resualt2 = getstart();
                    }else if (stpStart>13){
                        resualt2=stpStart-13+stpEnd;
                    }else if (stpStart<13){
                        resualt2=13-stpStart+stpEnd;
                    }
                }
            }if (ticket.get_position2==2){
                tahwel = "aaa";
                if (stpStart>12)
                    resualt2=stpStart-12+stpEnd;
                else if (stpStart<12)
                    resualt2=12-stpStart+stpEnd;
                else if (stpStart==12)
                    resualt2=getstart();
            }
        }else if (ticket.get_position1==2){
            if (ticket.get_position2==1){
                tahwel = "aaa";
                resualt2=stpEnd+stpStart-1;
            }else if (ticket.get_position2==0){
                if (ticket.tahwel_2==1)
                    tahwel = "a";
                else if (ticket.tahwel_2==2)
                    tahwel = "aa";
                resualt2=stpEnd+stpStart-1;
            }
        }
        return resualt2;
    }
    public static int getPrice2(){
        if (tickettyp==1)
        {switch (resualt2) {
            case 0:
                price =3;
            case 1:
                price =3;
                break;
            case 2:
                price =3;
                break;
            case 3:
                price =3;
                break;
            case 4:
                price =3;
                break;
            case 5:
                price =3;
                break;
            case 6:
                price =3;
                break;
            case 7:
                price =3;
                break;
            case 8:
                price =3;
                break;
            case 9:
                price =3;
                break;
            case 10:
                price =5;
                break;
            case 11:
                price =5;
                break;
            case 12:
                price =5;
                break;
            case 13:
                price =5;
                break;
            case 14:
                price =5;
                break;
            default:
                price = 7;
                break;
        }
        }else if (tickettyp==2){
            switch (resualt2) {
                case 0:
                    price =2;
                case 1:
                    price =2;
                    break;
                case 2:
                    price =2;
                    break;
                case 3:
                    price =2;
                    break;
                case 4:
                    price =2;
                    break;
                case 5:
                    price =2;
                    break;
                case 6:
                    price =2;
                    break;
                case 7:
                    price =2;
                    break;
                case 8:
                    price =2;
                    break;
                case 9:
                    price =2;
                    break;
                case 10:
                    price =4;
                    break;
                case 11:
                    price =4;
                    break;
                case 12:
                    price =4;
                    break;
                case 13:
                    price =4;
                    break;
                case 14:
                    price =4;
                    break;
                default:
                    price = 6;
                    break;
            }
        }else {
            price = 3;
        }
        return price;
    }
    public static int getImage2(){
        if (tickettyp==1) {
            switch (resualt2) {
                case 1:
                    get_ticket.price.setText("3");
                    get_ticket.ticket.setText("09");
                    break;
                case 2:
                    get_ticket.price.setText("3");
                    get_ticket.ticket.setText("09");
                    break;
                case 3:
                    get_ticket.price.setText("3");
                    get_ticket.ticket.setText("09");
                    break;
                case 4:
                    get_ticket.price.setText("3");
                    get_ticket.ticket.setText("09");
                    ;
                    break;
                case 5:
                    get_ticket.price.setText("3");
                    get_ticket.ticket.setText("09");
                    break;
                case 6:
                    get_ticket.price.setText("3");
                    get_ticket.ticket.setText("09");
                    break;
                case 7:
                    get_ticket.price.setText("3");
                    get_ticket.ticket.setText("09");
                    break;
                case 8:
                    get_ticket.price.setText("3");
                    get_ticket.ticket.setText("09");
                    break;
                case 9:
                    get_ticket.price.setText("3");
                    get_ticket.ticket.setText("09");
                    break;
                case 10:
                    get_ticket.price.setText("5");
                    get_ticket.ticket.setText("16");
                    break;
                case 11:
                    get_ticket.price.setText("5");
                    get_ticket.ticket.setText("16");
                    break;
                case 12:
                    get_ticket.price.setText("5");
                    get_ticket.ticket.setText("16");
                    break;
                case 13:
                    get_ticket.price.setText("5");
                    get_ticket.ticket.setText("16");
                    break;
                case 14:
                    get_ticket.price.setText("5");
                    get_ticket.ticket.setText("16");
                    break;
                case 15:
                    get_ticket.price.setText("5");
                    get_ticket.ticket.setText("16");
                    break;
                case 16:
                    get_ticket.price.setText("5");
                    get_ticket.ticket.setText("16");
                    break;
                default:
                    get_ticket.price.setText("7");
                    get_ticket.ticket.setText("37");
                    break;
            }
        }else if (tickettyp==2){
            switch (resualt2) {
                case 1:
                    get_ticket.price.setText("2");
                    get_ticket.ticket.setText("09");
                    break;
                case 2:

                    get_ticket.price.setText("2");
                    get_ticket.ticket.setText("09");
                    break;
                case 3:

                    get_ticket.price.setText("2");
                    get_ticket.ticket.setText("09");
                    break;
                case 4:

                    get_ticket.price.setText("2");
                    get_ticket.ticket.setText("09");
                    ;
                    break;
                case 5:

                    get_ticket.price.setText("2");
                    get_ticket.ticket.setText("09");
                    break;
                case 6:

                    get_ticket.price.setText("2");
                    get_ticket.ticket.setText("09");
                    break;
                case 7:

                    get_ticket.price.setText("2");
                    get_ticket.ticket.setText("09");
                    break;
                case 8:

                    get_ticket.price.setText("2");
                    get_ticket.ticket.setText("09");
                    break;
                case 9:

                    get_ticket.price.setText("2");
                    get_ticket.ticket.setText("09");
                    break;
                case 10:
                    get_ticket.price.setText("4");
                    get_ticket.ticket.setText("16");
                    break;
                case 11:
                    get_ticket.price.setText("4");
                    get_ticket.ticket.setText("16");
                    break;
                case 12:
                    get_ticket.price.setText("4");
                    get_ticket.ticket.setText("16");
                    break;
                case 13:
                    get_ticket.price.setText("4");
                    get_ticket.ticket.setText("16");
                    break;
                case 14:
                    get_ticket.price.setText("4");
                    get_ticket.ticket.setText("16");
                    break;
                case 15:
                    get_ticket.price.setText("4");
                    get_ticket.ticket.setText("16");
                    break;
                case 16:
                    get_ticket.price.setText("4");
                    get_ticket.ticket.setText("16");
                    break;
                default:
                    get_ticket.price.setText("5");
                    get_ticket.ticket.setText("37");
                    break;
            }
        }else {
            get_ticket.price.setText("3");
            get_ticket.ticket.setText("09");
        }
        return image;
    }

    public static int getstart(){
        if (stpStart==19||stpStart==22||stpStart==10||stpStart==13) {
            switch (stpEnd) {
                case 1:
                    resualt2 = 1;
                    break;
                case 2:
                    resualt2 = 2;
                    break;
                case 3:
                    resualt2 = 3;
                    break;
                case 4:
                    resualt2 = 4;
                    break;
                case 5:
                    resualt2 = 5;
                    break;
                case 6:
                    resualt2 = 6;
                    break;
                case 7:
                    resualt2 = 7;
                    break;
                case 8:
                    resualt2 = 8;
                    break;
                case 9:
                    resualt2 = 9;
                    break;
                case 10:
                    resualt2 = 10;
                    break;
                case 11:
                    resualt2 = 11;
                    break;
                case 12:
                    resualt2 = 11;
                    break;
                case 13:
                    resualt2 = 13;
                    break;
                case 14:
                    resualt2 = 14;
                    break;
                case 15:
                    resualt2 = 15;
                    break;
                case 16:
                    resualt2 = 16;
                    break;
                case 17:
                    resualt2 = 17;
                    break;
                case 18:
                    resualt2 = 18;
                    break;
                case 19:
                    resualt2 = 19;
                    break;
                case 20:
                    resualt2 = 20;
                    break;
                case 21:
                    resualt2 = 21;
                    break;
                case 22:
                    resualt2 = 22;
                    break;
                case 23:
                    resualt2 = 23;
                    break;
                case 24:
                    resualt2 = 24;
                    break;
                case 25:
                    resualt2 = 25;
                    break;
                case 26:
                    resualt2 = 26;
                    break;
                case 27:
                    resualt2 = 27;
                    break;
                case 28:
                    resualt2 = 28;
                    break;
                case 29:
                    resualt2 = 29;
                    break;
                case 30:
                    resualt2 = 30;
                    break;
                case 31:
                    resualt2 = 31;
                    break;
                case 32:
                    resualt2 = 32;
                    break;
                case 33:
                    resualt2 = 33;
                    break;
                case 34:
                    resualt2 = 34;
                    break;
                case 35:
                    resualt2 = 35;
                    break;
            }
        }
        return resualt2;
    }

    public static String getTahwel() {
        if (tahwel=="a")
            tahwel="انور السادات ";
        else if (tahwel=="aa")
            tahwel="الشهداء";
        else if (tahwel=="aaa")
            tahwel="العتبة";
        return tahwel;
    }

}