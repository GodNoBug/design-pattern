package principles.demo5;
// 迪米法特,降低了明星和粉丝及明星和媒体公司的耦合度
public class Client {
    public static void main(String[] args) {
        Agent agent=new Agent();
        Star star = new Star("林青霞");
        agent.setStar(star);
        Fans fans=new Fans("李四");
        agent.setFans(fans);
        Company company =new Company("媒体公司");
        agent.setCompany(company);


        agent.business();
        agent.meeting();
    }
}
