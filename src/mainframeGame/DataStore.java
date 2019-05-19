package mainframeGame;

import java.util.ArrayList;

/**
 *
 * @author Jelo
 */
public class DataStore {

    private String question, optionA, optionB, optionC, optionD;
    private ArrayList<ArrayList<String>> dataList = new ArrayList<>();
    private int questionNumber;
    private final ArrayList<String> data1 = new ArrayList<>();
    private final ArrayList<String> data2 = new ArrayList<>();
    private final ArrayList<String> data3 = new ArrayList<>();
    private final ArrayList<String> data4 = new ArrayList<>();
    private final ArrayList<String> data5 = new ArrayList<>();
    private final ArrayList<String> data6 = new ArrayList<>();

    public void fillList() {

        data1.add(0, "Who is the CEO of Mainframe?");
        data1.add(1, "Mick Hagen");
        data1.add(2, "Brad Hagen");
        data1.add(3, "Carl Youngblood");
        data1.add(4, "Vitalik Buterin");
        data1.add(5, "Mick Hagen");

        data2.add(0, "Which of these is not among the features of Mainframe?");
        data2.add(1, "Dark routing");
        data2.add(2, "Interoperability");
        data2.add(3, "Knowledge rewards");
        data2.add(4, "Encryption");
        data2.add(5, "Knowledge rewards");

        data3.add(0, "Who is in charge of Marketing in Mainframe?");
        data3.add(1, "Marketing Managers");
        data3.add(2, "Brad Hagen");
        data3.add(3, "Carl Youngblood");
        data3.add(4, "Vitalik Buterin");
        data3.add(5, "Brad Hagen");

        data4.add(0, "Which of these is among Mainframe's roadmap?");
        data4.add(1, "Millenium");
        data4.add(2, "Apollo");
        data4.add(3, "Brandish");
        data4.add(4, "Future");
        data4.add(5, "Apollo");

        data5.add(0, "Which protocol do Mainframe use for file storage?");
        data5.add(1, "Swarm protocol");
        data5.add(2, "Service discovery protocol");
        data5.add(3, "Swap, Swear, Swindle");
        data5.add(4, "Kademlia network");
        data5.add(5, "Swarm protocol");

        dataList.add(0, data1);
        dataList.add(1, data2);
        dataList.add(2, data3);
        dataList.add(3, data4);
        dataList.add(4, data5);
        dataList.add(5, data6);

    }

    public ArrayList<ArrayList<String>> getQuestionAndAnswerList() {
        return dataList;
    }

    public String getQuestion(int qstNumber) {
        questionNumber = qstNumber;
        return dataList.get(questionNumber).get(0);
    }

    public String getoptionA() {
        return dataList.get(questionNumber).get(1);
    }

    public String getoptionB() {
        return dataList.get(questionNumber).get(2);
    }

    public String getoptionC() {
        return dataList.get(questionNumber).get(3);
    }

    public String getoptionD() {
        return dataList.get(questionNumber).get(4);
    }
}
