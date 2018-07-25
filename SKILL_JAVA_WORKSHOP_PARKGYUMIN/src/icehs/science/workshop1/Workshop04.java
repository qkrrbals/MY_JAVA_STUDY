package icehs.science.workshop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ���� 4.
// Ŀ�� �ֹ��� �Ϸ��� �Ѵ�.
// �޴��� ����, �� �޴� ���� �� ���� �ֹ��� ������ �Է� �޾� �����ؾ� �� �� �ݾ��� ����� ����.
// �׸��� �� �ݾ��� ���� �ݾ��� �Ѿ�� ����Ʈ�� ������ �ش�.
// �� �ݾ� 12000�� �̻� : ���� �ݾ��� 1% ����
// �� �ݾ� 30000�� �̻� : ���� �ݾ��� 2% ����
public class Workshop04 {
    
    public static void main( String[] args ) {
        
        System.out.println( "========= �޴� =========" );
        System.out.println( " 1. �Ƹ޸�ī��   2000��" );
        System.out.println( " 2. ī���   3000��" );
        System.out.println( " 3. ���̱�   1500��" );
        System.out.println( " 4. ũ��ġ��   500��\n" );
        
        System.out.println( "========= �ֹ� =========" );
        System.out.print( " �Ƹ޸�ī�� �ֹ� ���� : " );
        int americano = getUserInput();
        
        System.out.print( " ī��� �ֹ� ���� : " );
        int latte = getUserInput();
        System.out.print( " ���̱� �ֹ� ���� : " );
        int bagel = getUserInput();
        System.out.print( " ũ��ġ�� �ֹ� ���� : " );
        int cheese = getUserInput();
        
        System.out.println( "========= �ݾ� =========" );
        int americanoPrice = americano *2000;
        System.out.println("�Ƹ޸�ī�� :"+ americanoPrice +"��");
        int lattePrice = latte *3000;
        System.out.println("�� :"+ lattePrice +"��");
        int bagelPrice = bagel *1500;
        System.out.println("���̱� :"+ bagelPrice +"��");
        int cheesePrice = cheese *500;
        System.out.println("ũ��ġ�� :"+ cheesePrice +"��");
        
        System.out.println( "======================" );
        int sum = americanoPrice + lattePrice + bagelPrice + cheesePrice;
        System.out.println("�� ���� �ݾ� :"+ sum +"��");
        int point = 0 ;
        if(sum >= 30000) {
        	point = (sum / 100)*2;
        	System.out.println("����Ʈ ���� :"+ point +"��");
        } else if(sum >= 12000) {
        	point = (sum / 100)*1;
        	System.out.println("����Ʈ ���� :"+ point +"��");
        }
        
    }
    
    public static int getUserInput() {
        
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        String inputString = null;
        
        try {
            inputString = br.readLine();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
        
        return Integer.parseInt( inputString );
    }
}
