import org.junit.Test;

import static org.junit.Assert.assertEquals;

//@RunWith(Parameterized.class)
public class MainTest {

  @Test
  public void singleUnitStringTest() {
    assertEquals("1 hour", Main.singleUnitString(1, "hour"));
    assertEquals("2 hours", Main.singleUnitString(2, "hour"));
  }

  @Test
  public void exampleTests() {
    assertEquals("1 hour, 1 minute and 2 seconds", Main.formatDuration(3662));
    assertEquals("1 second", Main.formatDuration(1));
    assertEquals("1 minute and 2 seconds", Main.formatDuration(62));
    assertEquals("2 minutes", Main.formatDuration(120));
    assertEquals("1 hour", Main.formatDuration(3600));

  }


//  @Test
//  public void checkAllDigitsTest(){
//    int[] test1 = {1, 2, 3, 4, 5, 7, 8, 6, 9};
//    assertEquals(true, Main.checkAllDigits(test1));
//  }
//
//  @Test
//  public void checkAllDigitsFailingTest(){
//    int[] test1 = {1, 2, 3, 4, 5, 9, 8, 6, 9};
//    assertFalse(Main.checkAllDigits(test1));
//  }
//
//  @Test
//  public void checkRowsTest(){
//    int[][] sudoku = {
//      {5, 3, 4, 6, 7, 8, 9, 1, 2},
//      {6, 7, 2, 1, 9, 5, 3, 4, 8},
//      {1, 9, 8, 3, 4, 2, 5, 6, 7},
//      {8, 5, 9, 7, 6, 1, 4, 2, 3},
//      {4, 2, 6, 8, 5, 3, 7, 9, 1},
//      {7, 1, 3, 9, 2, 4, 8, 5, 6},
//      {9, 6, 1, 5, 3, 7, 2, 8, 4},
//      {2, 8, 7, 4, 1, 9, 6, 3, 5},
//      {3, 4, 5, 2, 8, 6, 1, 7, 9}
//    };
//    assertEquals(true, Main.checkRows(sudoku));
//  }
//
//  @Test
//  public void checkColumnsTest(){
//    int[][] sudoku = {
//      {5, 3, 4, 6, 7, 8, 9, 1, 2},
//      {6, 7, 2, 1, 9, 5, 3, 4, 8},
//      {1, 9, 8, 3, 4, 2, 5, 6, 7},
//      {8, 5, 9, 7, 6, 1, 4, 2, 3},
//      {4, 2, 6, 8, 5, 3, 7, 9, 1},
//      {7, 1, 3, 9, 2, 4, 8, 5, 6},
//      {9, 6, 1, 5, 3, 7, 2, 8, 4},
//      {2, 8, 7, 4, 1, 9, 6, 3, 5},
//      {3, 4, 5, 2, 8, 6, 1, 7, 9}
//    };
//    assertEquals(true, Main.checkColumns(sudoku));
//  }
//
//  @Test
//  public void checkGridsTest(){
//    int[][] sudoku = {
//      {5, 3, 4, 6, 7, 8, 9, 1, 2},
//      {6, 7, 2, 1, 9, 5, 3, 4, 8},
//      {1, 9, 8, 3, 4, 2, 5, 6, 7},
//      {8, 5, 9, 7, 6, 1, 4, 2, 3},
//      {4, 2, 6, 8, 5, 3, 7, 9, 1},
//      {7, 1, 3, 9, 2, 4, 8, 5, 6},
//      {9, 6, 1, 5, 3, 7, 2, 8, 4},
//      {2, 8, 7, 4, 1, 9, 6, 3, 5},
//      {3, 4, 5, 2, 8, 6, 1, 7, 9}
//    };
//    assertEquals(true, Main.checkGrids(sudoku));
//  }
//
////  @Test
////  public void checkDiagonalsTest(){
////    int[][] sudoku = {
////      {5, 3, 4, 6, 7, 8, 9, 1, 2},
////      {6, 7, 2, 1, 9, 5, 3, 4, 8},
////      {1, 9, 8, 3, 4, 2, 5, 6, 7},
////      {8, 5, 9, 7, 6, 1, 4, 2, 3},
////      {4, 2, 6, 8, 5, 3, 7, 9, 1},
////      {7, 1, 3, 9, 2, 4, 8, 5, 6},
////      {9, 6, 1, 5, 3, 7, 2, 8, 4},
////      {2, 8, 7, 4, 1, 9, 6, 3, 5},
////      {3, 4, 5, 2, 8, 6, 1, 7, 9}
////    };
////    assertEquals(true, Main.checkDiagonals(sudoku));
////  }
//
//  @Test
//  public void exampleTest() {
//    int[][] sudoku = {
//      {5, 3, 4, 6, 7, 8, 9, 1, 2},
//      {6, 7, 2, 1, 9, 5, 3, 4, 8},
//      {1, 9, 8, 3, 4, 2, 5, 6, 7},
//      {8, 5, 9, 7, 6, 1, 4, 2, 3},
//      {4, 2, 6, 8, 5, 3, 7, 9, 1},
//      {7, 1, 3, 9, 2, 4, 8, 5, 6},
//      {9, 6, 1, 5, 3, 7, 2, 8, 4},
//      {2, 8, 7, 4, 1, 9, 6, 3, 5},
//      {3, 4, 5, 2, 8, 6, 1, 7, 9}
//    };
//    assertEquals(true, Main.check(sudoku));
//
//    sudoku[0][0]++;
//    sudoku[1][1]++;
//    sudoku[0][1]--;
//    sudoku[1][0]--;
//
//    assertEquals(false, Main.check(sudoku));
//
//    sudoku[0][0]--;
//    sudoku[1][1]--;
//    sudoku[0][1]++;
//    sudoku[1][0]++;
//
//    sudoku[4][4] = 0;
//
//    assertEquals(false, Main.check(sudoku));
//  }
//  @Test
//  public void SnailTest0() {
//    int[][] array
//      = {{}};
//    int[] r = {};
//    test(array, r);
//  }
//
//  @Test
//  public void SnailTest3() {
//    int[][] array
//      = {{1, 2, 3},
//      {4, 5, 6},
//      {7, 8, 9}};
//    int[] r = {1, 2, 3, 6, 9, 8, 7, 4, 5};
//    test(array, r);
//  }
//
//  @Test
//  public void SnailTest4() {
//    int[][] array = {{1, 2, 3, 4},
//      {5, 6, 7, 8},
//      {9, 10, 11, 12},
//      {13, 14, 15, 16}
//    };
//    int[] r = {1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10};
//    test(array, r);
//  }
//
//  @Test
//  public void SnailTest5() {
//    int[][] array = {{1, 2, 3, 4, 5},
//      {6, 7, 8, 9, 10},
//      {11, 12, 13, 14, 15},
//      {16, 17, 18, 19, 20},
//      {21, 22, 23, 24, 25}
//    };
//    int[] r = {1, 2, 3, 4, 5, 10, 15, 20, 25, 24, 23, 22, 21,
//      16, 11, 6, 7, 8, 9, 14, 19, 18, 17, 12, 13
//    };
//    test(array, r);
//  }
//
//  public String int2dToString(int[][] a) {
//    return Arrays.stream(a).map(row -> Arrays.toString(row)).collect(Collectors.joining());
//  }
//
//  public void test(int[][] array, int[] result) {
//    String text = int2dToString(array) + " should be sorted to " + Arrays.toString(result);
//    System.out.println(text);
//    Assert.assertArrayEquals( result, Main.snail(array));
//  }


//
//  @Test
//  public void resortTest() {
//    assertEquals("321", Main.reSort("123"));
//    assertEquals("321", Main.reSort("132"));
//  }
//
//  @Test
//  public void basicTests() {
//    assertEquals(21, Main.nextBiggerNumber(12));
//  }
//
//  @Test
//  public void basicTests2() {
//    assertEquals(531, Main.nextBiggerNumber(513));
//  }
//
//  @Test
//  public void basicTests3() {
//    assertEquals(2071, Main.nextBiggerNumber(2017));
//  }
//
//  @Test
//  public void basicTests4() {
//    assertEquals(441, Main.nextBiggerNumber(414));
//  }
//
//  @Test
//  public void basicTests5() {
//    assertEquals(414, Main.nextBiggerNumber(144));
//  }
//
//  @Test
//  public void basicTests6() {
//    assertEquals(19009, Main.nextBiggerNumber(10990));
//  }



//  @Test
//  public void test1000() {
//    assertEquals(120L, Main.findFactorialBase(463L));
//  }
//
//  @Test
//  public void test1001() {
//    assertEquals(120L, Main.findFactorialBase(120L));
//  }
//
//  @Test
//  public void test1002() {
//    assertEquals(720L, Main.findFactorialBase(721L));
//  }
//
//  @Test
//  public void test1003() {
//    assertEquals(120, Main.factorial(5));
//  }
//
//  @Test
//  public void test11() {
//    assertEquals("1212210", Main.dec2FactString(1001L));
//  }
//
//  @Test
//  public void test112() {
//    assertEquals("1000000", Main.dec2FactString(720L));
//  }
//
//  @Test
//  public void test12() {
//    assertEquals(1001L, Main.factString2Dec("1212210"));
//  }
//
//  @Test
//  public void test13() {
//    assertEquals(463L, Main.factString2Dec("341010"));
//  }
//
//
//  @Test
//  public void test141() {
//    assertEquals(1234567890, Main.factString2Dec("26A2116333000"));
//  }
//
//  @Test
//  public void test15() {
//    assertEquals("26A2116333000", Main.dec2FactString(1234567890));
//  }
//
//  @Test
//  public void test16() {
//    assertEquals("4042100", Main.dec2FactString(2990));
//  }
//  @Test
//  public void sampleTest() {
//    assertEquals("128.32.10.1", Main.longToIP(2149583361L));
//    assertEquals("128.114.17.104", Main.longToIP(2154959208L));
//    assertEquals("0.0.0.0", Main.longToIP(0));
//    assertEquals("128.32.10.1", Main.longToIP(2149583361L));
//  }

//  @Test
//  public void test0() {
//    assertNull("0 is not a perfect number", Main.isPerfectPower(0));
//  }
//
//  @Test
//  public void test1() {
//    assertNull("1 is not a perfect number", Main.isPerfectPower(1));
//  }
//
//  @Test
//  public void test2() {
//    assertNull("2 is not a perfect number", Main.isPerfectPower(2));
//  }
//
//  @Test
//  public void test3() {
//    assertNull("3 is not a perfect number", Main.isPerfectPower(3));
//  }
//
//  @Test
//  public void test4() {
//    assertArrayEquals("4 = 2^2", new int[]{2,2}, Main.isPerfectPower(4));
//  }
//
//  @Test
//  public void test5() {
//    assertNull("5 is not a perfect power", Main.isPerfectPower(5));
//  }
//
//  @Test
//  public void test8() {
//    assertArrayEquals("8 = 2^3", new int[]{2,3}, Main.isPerfectPower(8));
//  }
//
//  @Test
//  public void test9() {
//    assertArrayEquals("9 = 3^2", new int[]{3,2}, Main.isPerfectPower(9));
//  }
//
//  @Test
//  public void test95() {
//    assertArrayEquals("9 = 3^2", new int[]{5,3}, Main.isPerfectPower(125));
//  }
//
////  @Test
////  public void test96() {
////    assertArrayEquals("9 = 3^2", new int[]{3,4}, Main.isPerfectPower(243));
////  }
//
//  @Test
//  public void test97() {
//    assertArrayEquals("9 = 3^2", new int[]{226,3}, Main.isPerfectPower(11543176));
//  }
//
//  @Test
//  public void testUpTo500() {
//    int[] pp = {4, 8, 9, 16, 25, 27, 32, 36, 49, 64, 81, 100, 121, 125, 128, 144, 169, 196, 216, 225, 243, 256, 289, 324, 343, 361, 400, 441, 484};
//    for (int i: pp) assertNotNull(i+" is a perfect power", Main.isPerfectPower(i));
//  }
//
//  @Test
//  public void testRandomPerfectPowers() {
//    Random rnd = new Random();
//    for (int i = 0; i < 100; i++) {
//      int m = rnd.nextInt(254)+2;
//      int k = (int)(rnd.nextDouble()*(log(Integer.MAX_VALUE)/log(m)-2.0)+2.0);
//      int l = ipow(m, k);
//      int[] r = Main.isPerfectPower(l);
//      assertNotNull(l+" is a perfect power", r);
//      assertEquals(r[0]+"^"+r[1]+"!="+l, l, ipow(r[0], r[1]));
//    }
//  }
//
//  @Test
//  public void testRandomNumbers() {
//    Random rnd = new Random();
//    for (int i = 0; i < 100; i++) {
//      int l = rnd.nextInt(Integer.MAX_VALUE);
//      int[] r = Main.isPerfectPower(l);
//      if (r != null) assertEquals(r[0]+"^"+r[1]+"!="+l, l, ipow(r[0], r[1]));
//    }
//  }
//
//  private static int ipow(int b, int e) {
//    int p = 1;
//    for (; e > 0; e >>= 1) {
//      if ((e & 1) == 1) p *= b;
//      b *= b;
//    }
//    return p;
//  }

//  @Test
//  public void test() {
//
//    long startTime = System.nanoTime();
//    long output = Main.allSum();
//    long endTime = System.nanoTime();
//
//    System.out.println(output);
//    long duration = (endTime - startTime);
//    System.out.println(duration/1e9);
//  }


//  @Test
//  public void testExample() {
//    assertEquals("Score for [5,1,3,4,1] must be 250:", 250, Main.greedy(new int[]{5,1,3,4,1}));
//    assertEquals("Score for [1,1,1,3,1] must be 1100:", 1100, Main.greedy(new int[]{1,1,1,3,1}));
//    assertEquals("Score for [2,4,4,5,4] must be 450:", 450, Main.greedy(new int[]{2,4,4,5,4}));
//  }
//
//  @Test
//  public void test() {
//    System.out.println("Fixed Tests");
//    assertEquals("[101, 103]", Arrays.toString(Main.gap(2,100,110)));
//    assertEquals("[103, 107]", Arrays.toString(Main.gap(4,100,110)));
//    assertEquals(null, Main.gap(6,100,110));
//    assertEquals("[359, 367]", Arrays.toString(Main.gap(8,300,400)));
//    assertEquals("[337, 347]", Arrays.toString(Main.gap(10,300,400)));
//  }
//  @Test
//  public void test2() {
//    System.out.println("Fixed Tests");
//    assertEquals("[1000037, 1000039]", Arrays.toString(Main.gap(2,1000000,1100000)));
//  }

//  @Test
//  public void test12() {
//    List<long[]> res = new ArrayList<long[]>();
//    res.add(new long[] {15, 21});
//    res.add(new long[] {21, 15});
//    List<long[]> a = Main.removNb(26);
//    assertArrayEquals(res.get(0), a.get(0));
//    assertArrayEquals(res.get(1), a.get(1));
//  }
//  @Test
//  public void test14() {
//    List<long[]> res = new ArrayList<long[]>();
//    List<long[]> a = Main.removNb(100);
//    assertTrue(res.size() == a.size());
//  }

//  @Test public void loop_size_of_3() {
//    Node list = Node.createChain(1, 3);
//    int result = new LoopInspector().loopSize(list);
//    assertEquals("Incorrect loop size", 3, result);
//  }
//
//  @Test public void loop_size_of_29() {
//    Node list = Node.createChain(21, 29);
//    int result = new LoopInspector().loopSize(list);
//    assertEquals("Incorrect loop size", 29, result);
//  }
//
//  @Test public void loop_size_of_1087() {
//    Node list = Node.createChain(3904, 1087);
//    int result = new LoopInspector().loopSize(list);
//    assertEquals("Incorrect loop size", 1087, result);
//  }

//  @Parameters
//  public static Collection<Object[]> data() {
//    return Arrays.asList( new Object[][] {
//      {Arrays.asList("H", "O"),
//      Arrays.asList( 2,   1 ),
//      "H2O",
//      "water"},
//
//      {Arrays.asList("Mg", "H", "O"),
//        Arrays.asList(  1,   2,   2 ),
//        "Mg(OH)2",
//        "magnesium hydroxide"},
//
//      {Arrays.asList("K", "O", "N", "S"),
//        Arrays.asList( 4,   14,  2,   4 ),
//        "K4[ON(SO3)2]2",
//        "Fremy's salt"},
////
//      {Arrays.asList("H", "O"),
//        Arrays.asList(2,  1),
//        "{((H)2)[O]}",
//        "Fremy's salt"},
//
//    });
//  }
//
//  private Map<String,Integer> expected;
//  private String formula, name;
//
//  public MainTest(List<String> atoms, List<Integer> nums, String formula, String name) {
//    Map<String,Integer> exp = new HashMap<String,Integer>();
//    for (int i = 0 ; i < atoms.size() ; i++) exp.put(atoms.get(i), nums.get(i));
//
//    this.expected = exp;
//    this.formula = formula;
//    this.name = name;
//  }
//
//  @Test
//  public void testMolecule() {
//    System.out.println(expected);
//    assertEquals(String.format("Should parse %s: %s", name, formula),
//      expected, Main.getAtoms(formula));
//  }
//
//  @Test(expected = IllegalArgumentException.class)
//  public void errorTest() {
//    System.out.println(expected);
//    String formula = "Mg(OH]2";
//    Main.getAtoms(formula);
//  }
//  @Test
//  public void testEchoUntilByte255Encountered() {
//    assertEquals(new Main(",+[-.,+]").process("Codewars" + ((char) 255)),
//      "Codewars");
//  }
//
//  @Test
//  public void testEchoUntilByte0Encountered() {
//    assertEquals(new Main(",[.[-],]").process("Codewars" + ((char) 0)), ("Codewars"));
//  }
//
//  @Test
//  public void testTwoNumbersMultiplier() {
//    final char[] input = {8, 9};
//    assertEquals(new Main(",>,<[>[->+>+<<]>>[-<<+>>]<<<-]>>.").process(String.valueOf(input[0]) + String.valueOf(input[1])),
//      (String.valueOf((char) (input[0] * input[1]))));
//  }
//
//  @Test
//  public void test() {
//    assertEquals(new Main(",>+-[+++[+-++]]<+.").process("a"), ("b"));
//  }
//  @Test
//  public void test1() {
//    assertEquals(4, Main.largestDifference(new int[]{9,4,1,10,3,4,0,-1,-2}));
//  }
//
//  @Test
//  public void test2(){
//    assertEquals(0, Main.largestDifference(new int[]{3,2,1}));
//  }

//  private static String[] msg = {"should support finding peaks",
//    "should support finding peaks, but should ignore peaks on the edge of the array",
//    "should support finding peaks; if the peak is a plateau, it should only return the position of the first element of the plateau",
//    "should support finding peaks; if the peak is a plateau, it should only return the position of the first element of the plateau",
//    "should support finding peaks, but should ignore peaks on the edge of the array"};
//
//  private static int[][] array = {{1,2,3,6,4,1,2,3,2,1},
//    {3,2,3,6,4,1,2,3,2,1,2,3},
//    {3,2,3,6,4,1,2,3,2,1,2,2,2,1},
//    {2,1,3,1,2,2,2,2,1},
////    {2,1,3,1,2,2,2,2}
//    {14, 15, 14, -3, 17, 3, 11, 0, -1, -1, 2, 5, 1, 5, 2, 18, 18, 13, 5, 9, 2, -2, -5, 4, 16, 1}
////    {11,12,-4,-5,-3,-5,17,16,12,7,4,-5,7,19,6,14,13,14,10,10,7,-2,1,5}
//  };
//
//  private static int[][] posS  = {{3,7},
//    {3,7},
//    {3,7,10},
//    {2,4},
////    {2},
//    {1, 4, 6, 11, 13, 15, 19, 24}
//  };
//
//  private static int[][] peaksS = {{6,3},
//    {6,3},
//    {6,3,2},
//    {3,2},
////    {3}
//    {15, 17, 11, 5, 5, 18, 9, 16}
//  };
//
//  @Test
//  public void sampleTests() {
//    for (int n = 0 ; n < array.length ; n++) {
//      final int[] p1 = posS[n], p2 = peaksS[n];
//      Map<String,List<Integer>> expected = new HashMap<String,List<Integer>>() {{
//        put("pos",   Arrays.stream(p1).boxed().collect(Collectors.toList()));
//        put("peaks", Arrays.stream(p2).boxed().collect(Collectors.toList()));
//      }},
//        actual = Main.getPeaks(array[n]);
//      assertEquals(msg[n], expected, actual);
//    }
//  }

//  @Test
//  public void test1() {
//    String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
//    int n = 1;
//    assertEquals("Sheldon", Main.WhoIsNext(names, n));
//  }
//  @Test
//  public void test2() {
//    String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
//    int n = 6;
//    assertEquals("Sheldon", Main.WhoIsNext(names, n));
//  }
//  @Test
//  public void test3() {
//    String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
//    int n = 52;
//    assertEquals("Penny", Main.WhoIsNext(names, n));
//  }
//  @Test
//  public void test4() {
//    String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
//    long n = 7230702951l;
//    assertEquals("Leonard", Main.WhoIsNext(names, n));
//  }
  //7230702951

//  @Test
//  public void testZeros() throws Exception {
//    assertEquals(Main.zeros(0), 0);
//    assertEquals(Main.zeros(6), 1);
//    assertEquals(Main.zeros(14), 2);
//    assertEquals(Main.zeros(139729655), 34932408);
//  }


//  @Test
//  public void BasicTests1() {
//    System.out.println("****** Basic Tests small numbers******");
//    List<Integer> ts = new ArrayList<>(Arrays.asList(50, 55, 56, 57, 58));
//    int n = Main.chooseBestSum(163, 3, ts);
//    assertEquals(163, n);
//    ts = new ArrayList<>(Arrays.asList(50));
//    Integer m = Main.chooseBestSum(163, 3, ts);
//    assertEquals(null, m);
//    ts = new ArrayList<>(Arrays.asList(91, 74, 73, 85, 73, 81, 87));
//    n = Main.chooseBestSum(230, 3, ts);
//    assertEquals(228, n);
//  }
//
//  @Test
//  public void BasicTests2() {
//    System.out.println("****** Basic Tests small numbers******");
//    List<Integer> ts = new ArrayList<>(
//      Arrays.asList(100,76,56,44,89,73,68,56,64,123,2333,144,50,132,123,34,89));
//    int n = Main.chooseBestSum(880, 8, ts);
//    assertEquals(876, n);
//  }


//  private static void testing(boolean actual, boolean expected) {
//    assertEquals(expected, actual);
//  }

//  @Test
//  public void test() {
//    System.out.println("Fixed Tests scramble");
//    testing(Main.scramble("katas","steak"),false);
//    testing(Main.scramble("rkqodlw","world"), true);
//    testing(Main.scramble("cedewaraaossoqqyt","codewars"),true);
//
//    testing(Main.scramble("scriptjavx","javascript"),false);
//    testing(Main.scramble("scriptingjava","javascript"),true);
//    testing(Main.scramble("scriptsjava","javascripts"),true);
//    testing(Main.scramble("javscripts","javascript"),false);
//    testing(Main.scramble("aabbcamaomsccdd","commas"),true);
//    testing(Main.scramble("commas","commas"),true);
//    testing(Main.scramble("sammoc","commas"),true);
//  }
////  @Test
//  public void BasicTests() {
//    System.out.println("****** Basic Tests ******");
//    assertEquals("2000 103 123 4444 99", Main.orderWeight("103 123 4444 99 2000"));
//    assertEquals("11 11 2000 10003 22 123 1234000 44444444 9999", Main.orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
//  }

//  @Test
//  public void testEmptyArray() throws Exception {
//    assertEquals("Empty arrays should have a max of 0", 0, Main.sequence(new int[]{}));
//  }
//  @Test
//  public void testExampleArray() throws Exception {
//    assertEquals("Example array should have a max of 6", 6, Main.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
//  }



//  @Test
//  public void testSimpleDirReduc() {
//    assertArrayEquals("\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\"",
//      new String[]{"WEST"},
//      Main.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));
//    assertArrayEquals("\"NORTH\",\"SOUTH\",\"SOUTH\",\"EAST\",\"WEST\",\"NORTH\"",
//      new String[]{},
//      Main.dirReduc(new String[]{"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"}));
//  }
  
//
//  @Test
//  public void sampleTest() {
//    // assertEquals("expected", "actual");
//    assertEquals(true,Main.validParentheses( "()" ));
//    assertEquals(false,Main.validParentheses( "())" ));
//    assertEquals(true,Main.validParentheses( "32423(sgsdg)" ));
//    assertEquals(false,Main.validParentheses( "(dsgdsg))2432" ));
//    assertEquals(true,Main.validParentheses( "adasdasfa" ));
//  }
//
//  @Test
//  public void test1() {
//    assertEquals(2022, Main.findNb(4183059834009L));
//  }
//  @Test
//  public void test2() {
//    assertEquals(-1, Main.findNb(24723578342962L));
//  }
//  @Test
//  public void test3() {
//    assertEquals(4824, Main.findNb(135440716410000L));
//  }
//
//  @Test
//  public void test4() {
//    assertEquals(-1, Main.findNb(2304422822859502501L));
//  }
//

//  @Test
//  public void testNormalCondition() {
//    assertEquals(9, Main.solveSuperMarketQueue(new int[] { 2, 2, 3, 3, 4, 4 }, 2));
//  }
//
//  @Test
//  public void testEmptyArray() {
//    assertEquals(0, Main.solveSuperMarketQueue(new int[] {}, 1));
//  }
//
//  @Test
//  public void testSingleTillManyCustomers() {
//    assertEquals(15, Main.solveSuperMarketQueue(new int[] { 1, 2, 3, 4, 5 }, 1));
//  }

//  @Test
//  public void test1() {
//    assertEquals("YES", Main.Tickets(new int[] {25, 25, 50}));
//  }
//  @Test
//  public void test2() {
//    assertEquals("NO", Main.Tickets(new int []{25, 100}));
//  }
//
//  @Test
//  public void test3() {
//    assertEquals("NO", Main.Tickets(new int []{25, 25, 25, 25, 25, 100, 100}));
//  }
//
//  @Test
//  public void test4() {
//    assertEquals("YES", Main.Tickets(new int[] {25, 25, 50, 100}));
//  }
//
//  @Test
//  public void test5() {
//    assertEquals("NO", Main.Tickets(new int[] {25, 25, 50, 50, 100}));
//  }
//
//  @Test
//  public void test6() {
//    assertEquals("NO", Main.Tickets(new int[] {25, 25, 25, 25, 25, 25, 25, 50, 50, 50, 100, 100, 100, 100}));
//  }

//  @Test
//  public void test() {
//    assertEquals(3,Main.findEvenIndex(new int[] {1,2,3,4,3,2,1}));
//    assertEquals(1,Main.findEvenIndex(new int[] {1,100,50,-51,1,1}));
//    assertEquals(-1,Main.findEvenIndex(new int[] {1,2,3,4,5,6}));
//    assertEquals(3,Main.findEvenIndex(new int[] {20,10,30,10,10,15,35}));
//    assertEquals(-1,Main.findEvenIndex(new int[] {-8505, -5130, 1926, -9026}));
//    assertEquals(1,Main.findEvenIndex(new int[] {2824, 1774, -1490, -9084, -9696, 23094}));
//    assertEquals(6,Main.findEvenIndex(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
//  }

  
//  @Test
//  public void Tests() {
//    assertEquals("99:59:59", Main.makeReadable(359999));
//    assertEquals("00:00:00", Main.makeReadable(0));
//    assertEquals("00:00:05", Main.makeReadable(5));
//    assertEquals("00:01:00", Main.makeReadable(60));
//    assertEquals("23:59:59", Main.makeReadable(86399));
//
//  }
  
//  @Test
//  public void Test1() {
//    assertEquals(1, Main.digPow(89, 1));
//  }
//  @Test
//  public void Test2() {
//    assertEquals(-1, Main.digPow(92, 1));
//  }
//  @Test
//  public void Test3() {
//    assertEquals(51, Main.digPow(46288, 3));
//  }

//  @Test
//  public void testSomeUnderscoreLowerStart() {
//    String input = "the_Stealth_Warrior";
//    System.out.println("input: "+input);
//    assertEquals("theStealthWarrior", Main.toCamelCase(input));
//  }
//  @Test
//  public void testSomeDashLowerStart() {
//    String input = "the-Stealth-Warrior";
//    System.out.println("input: "+input);
//    assertEquals("theStealthWarrior", Main.toCamelCase(input));
//  }
}