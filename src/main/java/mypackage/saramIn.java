package mypackage;

/**
 * Created by hyemi on 2015-12-06.
 */
public class saramIn {

    String keyword;
    String company;
    String salary ;

    public saramIn(String keyword, String company, String salary) {
        this.keyword = keyword;
        this.company = company;
        this.setSalary(salary);
    }

    @Override
    public String toString() {
        return "saramIn{" +
                "keyword='" + keyword + '\'' +
                ", company='" + company + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary1) {
        int temp = Integer.parseInt(salary1);
        if(temp == 0)salary = "회사 내규에 따름";
        else if(temp == 3)salary = "1400 이하";
        else if(temp == 4)salary = "1400 ~1600만원";
        else if(temp == 5)salary = "1600~1800만원";
        else if(temp == 6)salary = "1800~2000만원";
        else if(temp == 7)salary = "2000~2200만원";
        else if(temp == 8)salary = "2200~2400만원";
        else if(temp == 9)salary = "2400~2600만원";
        else if(temp == 10)salary = "2600~2800만원";
        else if(temp == 11)salary = "2800~3000만원";
        else if(temp == 12)salary = "3000~3200만원";
        else if(temp == 13)salary = "3200~3400만원";
        else if(temp == 14)salary = "3400~3600만원";
        else if(temp == 15)salary = "3600~3800만원";
        else if(temp == 16)salary = "3800~4000만원";
        else if(temp == 17)salary = "4000~~5000만원";
        else if(temp == 18)salary = "5000~6000만원";
        else if(temp == 19)salary = "6000~7000만원";
        else if(temp == 20)salary = "7000~8000만원";
        else if(temp == 21)salary = "8000~9000만원";
        else if(temp == 22)salary = "9000~1억원만원";
        else if(temp == 23)salary = "1억원 이상";
        else if(temp == 99)salary = "면접 후 결정";

    }

}
