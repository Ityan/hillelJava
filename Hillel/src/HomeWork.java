/**
 * � ���� ��������� ��������������� ���������� ������
 * �������������� ������ �� ������� � ���������
 * Created by ITyan on 04.04.2015.
 */
public class HomeWork {
    public static void main(String[] args) {
        double perimeter = 20;
        double area = 25;

        resolve(perimeter, area);
    }

    /**
     * ����� ������ ���������� ���������
     * pow(x, 2) - ((perimeter / 2) * x) + area = 0
     *
     * @param perimeter �������� ��������������
     * @param area      ������� ��������������
     */
    public static void resolve(double perimeter, double area) {
        double width;
        double height;

        //����������� ������������
        double d = Math.pow((perimeter / 2), 2) - 4 * area;

        //����������� ������ � ������ ����� ���������� ���������
        //������ �� �������� �������������
        if (d > 0) {
            width = ((perimeter / 2) + Math.sqrt(d)) / 2;
            height = ((perimeter / 2) - Math.sqrt(d)) / 2;
            System.out.println("width = " + width + "\nheight = " + height);
        } else if (d == 0) {
            width = height = (perimeter / 2) / 2;
            System.out.println("width = " + width + "\nheight = " + height);
        } else {
            System.out.println("Equation has no solution!");
        }
    }
}
