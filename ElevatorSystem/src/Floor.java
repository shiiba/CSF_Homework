/**
 * Created with IntelliJ IDEA.
 * User: Shiiba
 * Date: 7/10/13
 * Time: 8:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class Floor {
    public int floors = 24;
    public int[] floorNumbers = new int[floors];

    public Floor() {
        for (int i = 1; i < floors; i++) {
            floorNumbers[i] = i;
        }
    }

}
