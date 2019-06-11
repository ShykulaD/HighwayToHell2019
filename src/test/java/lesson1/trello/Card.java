package lesson1.trello;

public class Card {
    public String id;
    public String decs;
    public String idBoard;
    public String iidList;
    public String name;
    public String url;
    public String desc;

    @Override
    public String toString() {
        return "Card{" +
                "id='" + id + '\'' +
                ", decs='" + decs + '\'' +
                ", idBoard='" + idBoard + '\'' +
                ", iidList='" + iidList + '\'' +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
