package pattern.behavioral.mediator.mediator;

import pattern.behavioral.mediator.HouseOwner;
import pattern.behavioral.mediator.Person;
import pattern.behavioral.mediator.Tenant;

// 具体的中介者角色类
public class MediatorStructure extends Mediator {
    // 聚合房东和具体的租房者
    private HouseOwner houseOwner;
    private Tenant tenant;


    @Override
    public void contact(String message, Person person) {
        if (person == houseOwner) {
            tenant.getMessage(message);
        } else {
            houseOwner.getMessage(message);
        }
    }

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }
}
