//package buoi09.main.exFindTheNextDay;
//
//public class NextDayCalculator {
//    public class NextDay {
//        public static String findNextDay(int day, int month, int year) {
//            boolean monthOfDay31 = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10;
//            boolean monthOfDay30 = month == 4 || month == 6 || month == 9 || month == 11;
//            boolean monthFebOfLeapYear = month == 2 && day == 29 && isDivisionYear(year);
//            boolean monthFebOfNotLeapYear = month == 2 && day == 28 && !isDivisionYear(year);
//            boolean dayThirdTyOne = day == 31 && monthOfDay31;
//            boolean dayThirdTy = day == 30 && monthOfDay30;
//            boolean validateInput = day < 1 || (day > 30 && monthOfDay30) || (day > 31 && monthOfDay31) || month < 1 || month > 12;
//            if (validateInput) {
//                return "Out of range!!!";
//            } else {
//                if (dayThirdTyOne || dayThirdTy || monthFebOfLeapYear || monthFebOfNotLeapYear) {
//                    return 1 + "/" + (month + 1) + "/" + year;
//                } else if (!isDivisionYear(year) && month == 2 && day > 28) {
//                    return "Không có ngày kể trên!!!";
//                } else if (day == 31 && month == 12) {
//                    return 1 + "/" + 1 + "/" + (year + 1);
//                }
//                return day + 1 + "/" + month + "/" + year;
//            }
//        }
//
//        public static boolean isDivisionYear(int year) {
//            if (year % 4 == 0) {
//                if (year % 100 == 0) {
//                    if (year % 400 == 0) {
//                        return true;
//                    }
//                } else {
//                    return true;
//                }
//            }
//            return false;
//        }
//    }
//}
