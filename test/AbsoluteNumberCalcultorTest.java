import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalcultorTest {


       @Test
      void testFindAbsolute() {
          int number = 0;
          int expected = 0;

          int result = AbsoluteNumberCalcultor.findAbsolute(number);

        //Là một hàm kiểm tra trong kiểm thử, có tác dụng so sánh giữa giá trị kỳ vọng và kết quả, nếu không băng nhau sẽ báo lỗi, nếu bằng nhau thì kiểm thử thành công.
          assertEquals(expected,result);
       }
}