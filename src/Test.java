import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ben on 11/30/17.
 */
public class Test {

    static List<Integer> theirs = Arrays.asList( 1727, 1354, 1369, 1727, 1437, 1374, 1703, 1353, 1372, 1356, 1716, 1709, 1712, 1736, 1287, 1462,
            1733, 1698, 1699, 1714, 1725, 1365, 1735, 1705, 1371, 1305, 1288, 1695, 1715, 1719, 1711, 1366, 1713, 1561, 1702, 1701, 1704, 1734,
            1722, 1692, 1721, 1723, 1376, 1357, 1690, 1728, 1349, 1370, 1707, 1732, 1461, 1367, 1710, 1452, 1696, 1351, 1559, 1693, 1352, 1560, 1368, 1729, 1731, 1375, 1724, 1718, 1485, 1363, 1706, 1717, 1730, 1358, 1355, 1362, 1726, 1350,
            1361, 1720, 1439, 1360, 1708, 1691, 1697, 1694, 1359, 1453, 1743);
    static List<Integer> mine = Arrays.asList(1354, 1369, 1437, 1727, 1374, 1703, 1353, 1372, 1356, 1716, 1712, 1709, 1736, 1287, 1462, 1733,
            1698, 1699, 1714, 1725, 1365, 1735, 1705, 1371, 1305, 1288, 1695, 1715, 1719, 1711, 1366, 1713, 1561, 1702, 1701, 1704,
            1734, 1722, 1692, 1721, 1723, 1376, 1357, 1690, 1728, 1349, 1370, 1707, 1732, 1461, 1367, 1710, 1452, 1696, 1351,
            1559, 1693, 1352, 1560, 1368, 1729, 1731, 1375, 1724, 1718, 1485, 1363, 1706, 1717, 1730, 1358, 1355, 1726, 1362,
            1743, 1350, 1361, 1720, 1439, 1360, 1708, 1691, 1697, 1694, 1359, 1453);

    public static void main(String []args) {

        ArrayList<Integer> remove = new ArrayList(theirs);
        remove.removeAll(mine);

        System.out.println(remove);

        ArrayList<Integer> add = new ArrayList(mine);
        add.removeAll(theirs);

        System.out.println(add);
    }
}