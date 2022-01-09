//package buoi09.main.exFindTheNextDay;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
// class NextDayCalculatorTest {
//
//    @Test
//    @DisplayName("testcase01") // ngay thuong , thang thuong
//     void findNextDay1() {
//        int day = 10;
//        int month = 2;
//        int year = 2000;
//
//        String expect = "11/2/2000";
//        assertEquals(expect, NextDayCalculator.NextDay(day, month, year));
//    }
//
//     @Test
//     @DisplayName("testcase02") // ngay cuoi thang-31
//     void findNextDay2() {
//         int day = 31;
//         int month = 1;
//         int year = 2000;
//
//         String expect = "1/2/2000";
//         assertEquals(expect, NextDayCalculator.NextDay(day, month, year));
//     }
//
//     @Test
//     @DisplayName("testcase03") // ngay cuoi thang-30
//     void findNextDay3() {
//         int day = 30;
//         int month = 4;
//         int year = 2000;
//
//         String expect = "1/5/2000";
//         assertEquals(expect, NextDayCalculator.NextDay(day, month, year));
//     }
//
//         @Test
//         @DisplayName("testcase04") // thang 2 nam nhuan
//         void findNextDay4() {
//             int day = 28;
//             int month = 2;
//             int year = 2000;
//
//             String expect = "29/2/2000";
//             assertEquals(expect, NextDayCalculator.NextDay(day, month, year));
//         }
//
//     @Test
//     @DisplayName("testcase05") // thang 2 nam thuong
//     void findNextDay5() {
//         int day = 28;
//         int month = 2;
//         int year = 2001;
//
//         String expect = "1/3/2001";
//         assertEquals(expect, NextDayCalculator.NextDay(day, month, year));
//     }
//
//     @Test
//     @DisplayName("testcase06") // thang 2 nam ko nhuan, ngay sau
//     void findNextDay6() {
//         int day = 29;
//         int month = 2;
//         int year = 2000;
//
//         String expect = "khong co ngay nhu tren";
//         assertEquals(expect, NextDayCalculator.NextDay(day, month, year));
//     }
//
//     @Test
//     @DisplayName("testcase07") // thang 2 nam nhuan sai
//     void findNextDay7() {
//         int day = 29;
//         int month = 2;
//         int year = 2001;
//
//         String expect = "28/2/2000";
//         assertEquals(expect, NextDayCalculator.NextDay(day, month, year));
//     }
//
//     @Test
//     @DisplayName("testcase08") // 31/12
//     void findNextDay8() {
//         int day = 31;
//         int month = 12;
//         int year = 2000;
//
//         String expect = "1/1/2001";
//         assertEquals(expect, NextDayCalculator.NextDay(day, month, year));
//     }
//
//
//
//}
