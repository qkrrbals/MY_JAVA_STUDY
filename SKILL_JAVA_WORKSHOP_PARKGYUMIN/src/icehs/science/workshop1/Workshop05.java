package icehs.science.workshop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ���� 5.
// A������ �б⸻�� �Ǿ���. �����񺰷� ������ �Է� �޾� ���б��� ���� �л��� �����Ϸ��� �Ѵ�.
// ���б��� ���� �� �ִ� ������ �Ʒ��� ����.
//   1) ������ 3.7 �̻�   2) �� ���� ������ 2.5 �̻� (�� �����̶� 2.5 �̸��� ������ �ִٸ�, �������� ���б� Ż��)
public class Workshop05 {
    
    public static void main( String[] args ) {
        
        System.out.print( "Computer Science ������ �Է��ϼ��� : " );
        double computer = getUserInput();
        System.out.print( "Java Programming ������ �Է��ϼ��� : " );
        double java = getUserInput();
        System.out.print( "���м��� ������ �Է��ϼ��� : " );
        double math = getUserInput();
        System.out.print( "������� ���� ������ �Է��ϼ��� : " );
        double opera = getUserInput();
        System.out.print( "������ ������ �Է��ϼ��� : " );
        double badminton = getUserInput();
        System.out.println( "==============================" );
        double average = (computer + java + math + opera + badminton)/5;
        System.out.println( "������"+ average +"�� �Դϴ�." );
        
        if(average >= 3.7 && computer >= 2.5 && java >= 2.5 && math >= 2.5 &&opera >=2.5 &&badminton >=2.5) {
        						System.out.println("���� �б� ���б� ����� �Դϴ�.");
        
        }
    }
    
    public static double getUserInput() {
        
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        String inputString = null;
        
        try {
            inputString = br.readLine();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
        
        return Double.parseDouble( inputString );
    }
}
