import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

//  private class Time
  static String singleUnitString(Integer unitVal, String unit) {
    return String.valueOf(unitVal) + " " + unit + (unitVal > 1 ? "s" : "");
  }

  static String joinString(List<String> allString) {
    if (allString.size() == 0) return "now";
    if (allString.size() == 1) return allString.get(0);
    if (allString.size() == 2) return
      allString.get(0) + " and " +
      allString.get(1);
    return  allString.stream().limit(allString.size() - 2)
      .collect(Collectors.joining(", ")) + ", " +
      allString.get(allString.size() - 2) + " and " +
      allString.get(allString.size() - 1);
  }

  public static String formatDuration(int seconds) {
    int years = seconds / (86400 * 365);
    int days = (seconds % (86400 * 365)) / 86400;
    int hours = (seconds % 86400) / 3600;
    int minutes = (seconds % 3600) / 60;
    int pureSeconds = seconds % 60;
    List<String> allUnits = List.of("year", "day", "hour", "minute", "second");
    List<Integer> unitVals = List.of(years, days, hours, minutes, pureSeconds);
    List<String> output = IntStream.range(0, unitVals.size())
      .filter(i -> unitVals.get(i) > 0)
      .mapToObj(i -> singleUnitString(unitVals.get(i), allUnits.get(i)))
      .collect(Collectors.toList());
    return joinString(output);
  }




//  public static boolean checkAllDigits(int[] arr) {
//    return Arrays.equals(
//      Arrays.stream(arr).sorted().toArray(),
//      IntStream.range(1, 10).toArray()
//    );
//  }
//
//  public static boolean checkRows(int[][] sudoku){
//    return Arrays.stream(sudoku)
//      .allMatch(Main::checkAllDigits);
//  }
//
//  public static boolean checkColumns(int[][] sudoku){
//    return IntStream.range(0, 9)
//      .mapToObj(x -> IntStream.range(0, 9).map(y -> sudoku[y][x]).toArray())
//      .allMatch(Main::checkAllDigits);
//  }
//
//  public static boolean checkGrids(int[][] sudoku){
//    return IntStream.range(0, 3).mapToObj(w ->
//      IntStream.range(0, 3).mapToObj(x ->
//        IntStream.range(0, 3).flatMap(y ->
//          Arrays.stream(IntStream.range(0, 3).map(z ->
//            sudoku[(3 * x) + z][(3 * w) + y]).toArray()
//          )
//        ).toArray()
//      ).allMatch(Main::checkAllDigits)
//    ).allMatch(x -> x);
//  }
//
//
//  public static boolean check(int[][] sudoku) {
//    return checkRows(sudoku) &&
//      checkColumns(sudoku) &&
//      checkGrids(sudoku);
//  }

  //  public static boolean checkDiagonals(int[][] sudoku){
//    boolean match1 =  checkAllDigits(IntStream.range(0, 9)
//      .map(x -> sudoku[x][x])
//      .toArray());
//    boolean match2 = checkAllDigits(IntStream.range(0, 9)
//        .map(x -> sudoku[x][9 - x - 1])
//        .toArray());
//    return match1 && match2;
//  }

//  public static int[] snail(int[][] array) {
//
//    int step = array[0].length;
//
//    int i = 0;
//    List<Integer> indexArray = new ArrayList<>();
//    int currentStep = step;
//    while (indexArray.size() < step * step) {
//      for(int j = 0; j < currentStep; j++){
//        i ++;
//        indexArray.add(i);
//      }
//      currentStep -= 1;
//      for(int j = 0; j < currentStep; j++){
//        i += step;
//        indexArray.add(i);
//      }
//      for(int j = 0; j < currentStep; j++){
//        i --;
//        indexArray.add(i);
//      }
//      currentStep -= 1;
//      for(int j = 0; j < currentStep; j++){
//        i -= step;
//        indexArray.add(i);
//      }
//    }
//
//    int[] flatArray = Arrays.stream(array)
//      .flatMapToInt(o -> Arrays.stream(o))
//      .toArray();
//
//    return indexArray.stream()
//      .mapToInt(x -> flatArray[x - 1])
//      .toArray();
//  }

//  public static String reSort(String n) {
//    return Arrays.stream(n.split(""))
//      .sorted(Comparator.reverseOrder())
//      .collect(Collectors.joining(""));
//  }
//
//  public static long nextBiggerNumber(long n)
//  {
//    String stringN = String.valueOf(n);
//    if(reSort(stringN).equals(stringN)) return -1;
//
//    int varNum = IntStream.iterate(stringN.length() - 1, j -> j - 1)
//      .filter(j -> !reSort(stringN.substring(j)).equals(stringN.substring(j)))
//      .findFirst()
//      .orElse(0);
//
//    String subNum = stringN.substring(varNum);
//    String subN = subNum.substring(1);
//    String firstNum = subNum.substring(0, 1);
//
//    String toSwap = getDigitToSwap(firstNum, subN);
//
//    List<String> toSwapList = getSwapList(firstNum, subN, toSwap);
//
//    return Long.parseLong(stringN.substring(0, varNum) + toSwap +
//        toSwapList.stream().sorted().collect(Collectors.joining())
//    );
//  }
//
//  private static List<String> getSwapList(String firstNum, String subN, String toSwap) {
//    List<String> toSwapList = new ArrayList<>(List.of(subN.split("")));
//    toSwapList.remove(toSwap);
//    toSwapList.add(firstNum);
//    return toSwapList;
//  }
//
//  private static String getDigitToSwap(String firstNum, String subN) {
//    return Arrays.stream(subN.split(""))
//      .filter(x -> x.compareTo(firstNum) > 0)
//      .min(Comparator.comparing(String::valueOf))
//      .orElseThrow(NoSuchElementException::new);
//  }

//  public static int findFactorialBase(long n) {
//    int i = 2;
//    long tot = 1;
//    for (; (tot * i) <= n; ++i){
//      tot *= i;
//    }
//    return i;
//  }
//
//  public static long factorial(int n) {
//    if (n == 0 || n == 1) return 1;
//    return factorial(n -1 ) * n;
//  }
//
//  public static int parseString(char s) {
//    if (s < 65) return s - 48;
//    return s - 55;
//  }
//
//  public static String returnString(long n) {
//    if (n < 10) return String.valueOf(n);
//    return String.valueOf((char)(n + 55));
//  }
//
//  public static String dec2FactString(long nb) {
//    System.out.println(nb);
//    String output = "";
//    int factorialBase = findFactorialBase(nb);
//    for (int i = factorialBase - 1; i >= 0; i--){
//      long factI = factorial(i);
//      output += returnString(nb / factI);
//      nb = nb % factI;
//    }
//    return output;
//  }
//
//  public static long factString2Dec(String str) {
//    System.out.println(str);
//    return IntStream.range(0, str.length())
//      .mapToLong(i -> factorial(i) *
//        parseString(str.charAt(str.length() - i - 1))
//      )
//      .reduce(Long::sum)
//      .orElse(0);
//  }

  //  public static String longToIP(long ip) {
//    // Java doesn't have uint32, so here we use long to represent int32
//    StringBuilder output1 = new StringBuilder();
//    var ipCopy = ip;
//    for (int i = 0; i < 32; i++) {
//      output1.append(ipCopy % 2);
//      ipCopy /= 2;
//    }
//    var temp = Long.toBinaryString(ip);
//    var output2 = output1.reverse().toString();
//    List<String> finalOutput = new ArrayList<>();
//    for (int i = 0; i < 4; i++) {
//      int tempString = parseInt(output2.substring(i * 8, (i + 1) * 8), 2);
//      finalOutput.add(String.valueOf(tempString));
//    }
//    return finalOutput.stream().collect(Collectors.joining("."));
//  }
//

//  public static int[] isPerfectPower(int n) {
//    Set<Integer> x = new HashSet<>(Set.of(1, 2, 3));
//
//    return IntStream.range(2, (int) sqrt(n) + 1)
//      .filter(i -> n % i == 0)
//      .mapToObj(i -> new int[] {i, (int)(log(n) / log(i) + 0.00000001)})
//      .filter(i -> pow(i[0], i[1]) == n)
//      .findFirst()
//      .orElse(null);
//  }
//  public static int[] isPerfectPower(int n) {
//    for (int i = 2; i < Math.pow(n, 0.51); i++){
//      var output = Math.log(n)/Math.log(i);
//      if (output % 1 < 1e-9 || (output % 1 - 1) > - 1e-9){
//        var exactOutput = Math.toIntExact(Math.round(output));
//        if (BigInteger.valueOf(i).pow(exactOutput).equals(BigInteger.valueOf(n))) {
//          return new int[]{i, exactOutput};
//        }
//      }
//    }
//    return null;
//  }

//  private static Map.Entry<String, Integer> updateBestPoints(String diceString) {
//
//    List<String> keys = new ArrayList<>(List.of(
//      "111", "666", "555", "444", "333", "222", "1", "5")
//    );
//    List<Integer> values = new ArrayList<>(List.of(
//      1000, 600, 500, 400, 300, 200, 100, 50
//    ));
//
//    for (int i = 0; i < keys.size(); i++) {
//      if (diceString.matches(".*" + keys.get(i) + ".*")) {
//        return new AbstractMap.SimpleEntry<>(
//          diceString.replaceFirst(keys.get(i), ""), values.get(i)
//        );
//      }
//    }
//    return new AbstractMap.SimpleEntry<>(diceString, 0);
//  }
//
//  public static int greedy(int[] dice){
//    String diceString = Arrays
//      .stream(dice)
//      .sorted()
//      .mapToObj(String::valueOf)
//      .collect(Collectors.joining());
//
//    int totalPoints = 0;
//    String newDiceString = diceString;
//
//    do {
//      diceString = newDiceString;
//      Map.Entry<String, Integer> tempClass = updateBestPoints(newDiceString);
//      newDiceString = tempClass.getKey();
//      totalPoints += tempClass.getValue();
//    } while (!(newDiceString.equals(diceString) || newDiceString.equals("")));
//
//    return totalPoints;
//  }
//

//  public static boolean isPrime(long x) {
//    if (x == 2) return true;
//    for (int i = 3; i <= (int) Math.sqrt(x); i+=2){
//      if (x % i == 0) {
//        return false;
//      }
//    }
//    return true;
//  }
//
//  public static long[] gap(int g, long m, long n) {
//    int currentGap = 0;
//    boolean flag = false;
//    long i = (m % 2 == 0) ? m + 1: m;
//    while (i <= n) {
//      if (isPrime(i)) {
//        if (currentGap == g) {
//          return new long[]{i - g, i};
//        }
//        currentGap = 0;
//      }
//      currentGap += 2;
//      i +=2;
//    }
//    return null;
//  }


//  public static List<long[]> removNb(long n) {
//    long sumN = n * (n+1) / 2;
//    List<long[]> result = new ArrayList<>();
//    for (int i = 2; i < n; i++){
//      if (  (sumN - i)  % (i + 1) == 0 ) {
//        long secondElement = (sumN - i) / (i + 1);
//        if (secondElement < n){
//          result.add(new long[]{i, secondElement});
//        }
//      }
//    }
//    return result;
//  }
//

//
//  public int loopSize(Node node) {
//    HashMap<Node, Integer> hs = new HashMap<>();
//    int i;
//    for(i = 0; !hs.containsKey(node); i++) {
//      hs.put(node, i);
//      node = node.getNext();
//    }
//    return i - hs.get(node);
//  }
//  public static HashMap<String,Integer> getAtoms(String formula) {
//
//    int i = 0;
//    HashMap<String, Integer> output = new HashMap<>();
//    int multiplier;
//
//    while (i < formula.length()) {
//      String currentElement = getCurrentElement(formula, i);
//      if(currentElement != "") {
//        i += currentElement.length();
//        multiplier = findTrailingMultiplier(formula, i);
//        output = updateOutputHashmap(output, currentElement, multiplier);
//      } else if (formula.substring(i).matches("^[\\[\\{\\(].*")) {
//        int closingI = findClosingBracket(formula, i);
//        currentElement = formula.substring(i+1, closingI);
//        HashMap<String, Integer> currentHashMap = getAtoms(currentElement);
//        multiplier = findTrailingMultiplier(formula, closingI + 1);
//        output = addToOutputHashmap(output, currentHashMap, multiplier);
//        i = closingI + 1;
//      } else {
//        throw new IllegalArgumentException("Ouch!");
//      }
//      while (formula.substring(i).matches("^\\d.*")){
//        i++;
//      }
//    }
//    return output;
//  }
//
//  private static HashMap<String, Integer> addToOutputHashmap(
//    HashMap<String, Integer> output,
//    HashMap<String, Integer> currentHashMap,
//    int multiplier) {
//    for (String currentElement: currentHashMap.keySet()) {
//      if(output.containsKey(currentElement)) {
//        output.put(currentElement,
//          output.get(currentElement) + currentHashMap.get(currentElement) * multiplier);
//      } else {
//        output.put(currentElement, currentHashMap.get(currentElement) * multiplier);
//      }
//    }
//    return output;
//  }
//
//  private static int findTrailingMultiplier(String formula, int i) {
//    String[] formulaArray = formula.substring(i).split("");
//    int newI = 0;
//    while (i + newI < formula.length() &&
//      formulaArray[newI].matches("\\d")) {
//      newI++;
//    }
//    if (newI == 0) return 1;
//    return parseInt(formula.substring(i, i + newI));
//  }
//
//  private static HashMap<String, Integer> updateOutputHashmap(
//    HashMap<String, Integer> output, String currentElement, int multiplier) {
//    if(output.containsKey(currentElement)) {
//      output.put(currentElement, output.get(currentElement) + multiplier);
//    } else {
//      output.put(currentElement, multiplier);
//    }
//    return output;
//  }
//
//  private static String getCurrentElement(String formula, int i) {
//    Pattern p = Pattern.compile("^[A-Z][a-z]*");
//    Matcher m = p.matcher(formula.substring(i));
//    while (m.find()) {
//      return (m.group());
//    }
//    return "";
//  }
//
//  private static int findMultiplier(String currentElement) {
//    Pattern p = Pattern.compile("[0-9]+$");
//    Matcher m = p.matcher(currentElement);
//    while (m.find()) {
//      return parseInt(m.group());
//    }
//    return 1;
//  }
//
//  private static int findClosingBracket(String formula, int i) {
//    String[] formulaArray = formula.split("");
//    int closingI = i;
//    String closingType;
//    switch (formulaArray[i]) {
//      case "(":
//        closingType = ")";
//        break;
//      case "{":
//        closingType = "}";
//        break;
//      case "[":
//        closingType = "]";
//        break;
//      default:
//        throw new IllegalStateException("Unexpected value: " + formulaArray[i]);
//    }
//    int count = 1;
//    do {
//      closingI++;
//
//      if (closingI == formulaArray.length) {
//        throw new IllegalArgumentException("Unexpected value: " + formulaArray[i]);
//      }
//
//      if (formulaArray[closingI].compareTo(formulaArray[i]) == 0) {
//        count++;
//      }
//      if (formulaArray[closingI].compareTo(closingType) == 0) {
//        count--;
//      }
//    } while (count != 0);
//
//    return closingI;
//  }



//
//  char[] program;
//  int instPointer = 0;
//  int dataPointer = 0;
//  int[] memoryArray = (int[]) Array.newInstance(int.class, 10000);
//
//  public Main(String code) {
//    program = code.toCharArray();
//  }
//
//  private static char increment(int x) {
//    return (char) ((x == 255) ? 0 : x + 1);
//  }
//
//  private static char decrement(int x) {
//    return (char) ((x == 0) ? 255 : x - 1);
//  }
//
//  private void startLoop() {
//    if (memoryArray[dataPointer] == 0) {
//      int bracketCount = 1;
//      do {
//        instPointer++;
//        if (program[instPointer] == ']') {
//          bracketCount--;
//        }
//        if (program[instPointer] == '[') {
//          bracketCount++;
//        }
//      } while (bracketCount != 0);
//    }
//  }
//
//  private void endLoop() {
//    if (memoryArray[dataPointer] != 0) {
//      int bracketCount = -1;
//      instPointer--;
//      while (bracketCount != 0) {
//        if (program[instPointer] == ']') {
//          bracketCount--;
//        }
//        if (program[instPointer] == '[') {
//          bracketCount++;
//        }
//        instPointer--;
//      }
//    }
//  }
//
//  public String process(String input) {
//
//    char[] inputArray = input.toCharArray();
//    StringBuilder output = new StringBuilder();
//    int i = 0;
//
//    while (i <= input.length() && instPointer < program.length) {
//      switch (program[instPointer]) {
//        case '>' -> dataPointer++;
//        case '<' -> dataPointer--;
//        case '+' -> memoryArray[dataPointer] = increment(memoryArray[dataPointer]);
//        case '-' -> memoryArray[dataPointer] = decrement(memoryArray[dataPointer]);
//        case '.' -> output.append((char) memoryArray[dataPointer]);
//        case ',' -> {
//          memoryArray[dataPointer] = inputArray[i];
//          i++;
//        }
//        case '[' -> startLoop();
//        case ']' -> endLoop();
//      }
//      instPointer++;
//    }
//    return String.valueOf(output);
//  }

//  public static int largestDifference(int[] data) {
//
//    int max_dist = 0;
//
//
//    for(int i = 0; i < data.length - 1; i++) {
//      for (int j = 0; j < data.length; j++) {
//        if ( (data[i] <= data[j]) && (j - i) > max_dist) {
//          max_dist = j-i;
//        }
//      }
//    }
//    //code here
//    return max_dist;
//
//  }
//
//  public static Map<String, List<Integer>> getPeaks(int[] arr) {
//
//    int i = 1;
//    int j = 2;
//    List<Integer> peaks = new ArrayList<>();
//    List<Integer> pos = new ArrayList<>();
//
//    while (i < arr.length - 1 && j < arr.length) {
//      if (arr[i] == arr[j]){
//        j++;
//        continue;
//      }
//      if (arr[i - 1] < arr[i] && arr[j] < arr[i]) {
//        peaks.add(arr[i]);
//        pos.add(i);
//        i = j;
//        j = j + 1;
//      } else {
//        i = j - 1;
//      }
//      i++;
//      j++;
//    }
//    return getHashMap(peaks, pos);
//  }
//
//  private static HashMap<String, List<Integer>> getHashMap(List<Integer> peaks, List<Integer> pos) {
//    HashMap<String, List<Integer>> output = new HashMap<>();
//    output.put("pos", pos);
//    output.put("peaks", peaks);
//    return output;
//  }

//  public static Map<String, List<Integer>> getPeaks(int[] arr) {
//
//    System.out.println(
//      Arrays.stream(arr)
//        .mapToObj(String::valueOf)
//        .collect(Collectors.joining(","))
//    );
//    int i = 1;
//    int j = 2;
//    List<Integer> peaks = new ArrayList<>();
//    List<Integer> pos = new ArrayList<>();
//
//    while (i < arr.length - 1) {
//      if (arr[i - 1] > arr[i] || arr[i] < arr[i + 1]) {
//        while (j < arr.length && arr[j] == arr[i]) {
//          j++;
//        }
//        j++;
//        i++;
//        continue;
//      }
//      if (arr[i - 1] < arr[i]) {
//        if (arr[i + 1] < arr[i]) {
//          peaks.add(arr[i]);
//          pos.add(i);
//          j++;
//          i++;
//          continue;
//        }
//        while (j < arr.length && arr[j] == arr[i]) {
//          j++;
//        }
//        if (j == arr.length) {
//          break;
//        }
//        if (arr[j] < arr[i]) {
//          peaks.add(arr[i]);
//          pos.add(i);
//          i = j - 1;
//          j = i + 1;
//          break;
//        }
//      }
//    }
//
//    HashMap<String, List<Integer>> output = new HashMap<>();
//    output.put("pos", pos);
//    output.put("peaks", peaks);
//    return output;
//  }
//
//  public static ArrayList<Integer> decompose(int n) {
//    if (n % 2 == 0) {
//      return new ArrayList<>(List.of(2, n / 2));
//    }
//    for (int i = 3; i <= (int) Math.pow(n, 0.5); i += 2) {
//      if (n % i == 0) {
//        return new ArrayList<>(List.of(i, n / i));
//      }
//    }
//    return new ArrayList<>(List.of(n, 1));
//  }
//
//  public static String formatCorrectly(List<List<Integer>> input) {
//    Map<Integer, Long> outputEntrySet = input
//      .stream()
//      .collect(Collectors.groupingBy(x -> x.get(0), Collectors.counting()));
//    List<Integer> keys = new ArrayList<>(outputEntrySet.keySet().stream().collect(Collectors.toList()));
//    Collections.sort(keys);
//
//    String result = "";
//    for (int k : keys) {
//      Long currentKeyset = outputEntrySet.get(k);
//      result += ("(" + k);
//      if (currentKeyset > 1) {
//        result += ("**" + currentKeyset);
//      }
//      result += ")";
//    }
//    return result;
//  }
//
//  public static String factors(int n) {
//    List<List<Integer>> outputList = new ArrayList<>(List.of());
//    boolean flag = true;
//    while (flag) {
//      List<Integer> newN = decompose(n);
//      outputList.add(newN);
//      if (newN.get(0) == n) {
//        flag = false;
//      }
//      n = newN.get(1);
//    }
//    return formatCorrectly(outputList);
//  }
//
//  public static String WhoIsNext(String[] names, long n) {
//    int i = 0;
//    long total = 0;
//    do {
//      if (total + names.length * Math.pow(2, i) > n) {
//        int index = (int) ((n - total - 1) / Math.pow(2, i));
//        return names[index];
//      }
//      total += names.length * Math.pow(2, i);
//      i++;
//    } while (total < Long.MAX_VALUE);
//    return "Unknown";
//  }
//  public static int zeros(int n) {
//    int sum = 0;
//    while (n > 0) {
//      sum = sum + n/5;
//      n = n/5;
//    }
//    return sum;
//  }


//  public static List<List<Integer>> combinations(
//    List <Integer> ls, List <Integer> current,
//    int maxDepth, int currentDepth
//  ) {
//    List<List<Integer>> allCombs = new ArrayList<>();
//    for (int i = 0; i < ls.size(); i++) {
//      List<Integer> tempList = new ArrayList<>(current);
//      tempList.add(ls.get(i));
//      if (currentDepth == maxDepth - 1) {
//        allCombs.add(tempList);
//      } else {
//        int finalI = i;
//        List<Integer> removedList = ls
//          .stream()
//          .filter(x -> x >= ls.get(finalI))
//          .collect(Collectors.toList());
//        removedList.remove(ls.get(i));
//        allCombs.addAll(
//          combinations(
//            removedList, tempList, maxDepth, currentDepth + 1
//          )
//        );
//      }
//    }
//    return allCombs;
//  }
//
//  public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
//
//    Collections.sort(ls);
//    ls.forEach(System.out::println);
//    List<List<Integer>> allCombs = combinations(
//      ls, new ArrayList<>(), k, 0
//    );
//
//    int output = allCombs
//      .stream()
//      .mapToInt(x -> x.stream().mapToInt(y -> y).sum())
//      .filter(x ->  x <= t)
//      .max()
//      .orElse(-1);
//    return (output == -1) ? null : output;
//  }

//  public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
//
//    Collections.sort(ls);
//    List<Integer> tempList = new ArrayList<>(ls.subList(0, k));
//    int output = -1;
//    int j = k;
//    while (tempList.stream().mapToInt(i -> i).sum() <= t && j < ls.size()) {
//      output = tempList.stream().mapToInt(i -> i).sum();
//      tempList.remove(0);
//      tempList.add(ls.get(j));
//      j++;
//    }
//
//    return (output == -1) ? null : output;
//  }

//  public static boolean scramble(String str1, String str2) {
//    System.out.println(str1);
//    System.out.println(str2);
//    String sortedS1 = Arrays.stream(str1
//      .split(""))
//      .sorted()
//      .collect(Collectors.joining());
//
//    String sortedS2 = Arrays.stream(str2
//      .split(""))
//      .sorted()
//      .collect(Collectors.joining());
//
//    int j = 0;
//    for (int i = 0; i < str2.length() ; i++, j++) {
//      if (j == str1.length()) {
//        return false;
//      }
//      while (sortedS1.charAt(j) != sortedS2.charAt(i)) {
//        j++;
//        if (j == str1.length()) {
//          return false;
//        }
//      }
//    }
//    return true;
//  }

//  public static boolean scramble(String str1, String str2) {
//    System.out.println(str1);
//    System.out.println(str2);
//    String sortedS1 = str1
//      .chars()
//      .mapToObj(Character::toString)
//      .sorted()
//      .collect(Collectors.joining());
//
//    String sortedS2 = str2
//      .chars()
//      .sorted()
//      .mapToObj(Character::toString)
//      .collect(Collectors.joining(".*"));
//
//    return sortedS1.matches(".*" + sortedS2 + ".*");
//  }


//  public static int digitSum(Object o) {
//    return String.valueOf(o)
//      .chars()
//      .mapToObj(x -> Integer.parseInt(String.valueOf(Character.getNumericValue(x))))
//      .mapToInt(Integer::intValue)
//      .sum();
//  }


//  public static String orderWeight(String strng) {
//    String weightArray = Arrays
//      .stream(strng.split(" "))
//      .sorted()
//      .sorted(Comparator.comparing(Main::digitSum))
//      .collect(Collectors.joining(" "));
//    return weightArray;
//  }

//  public static String orderWeight(String strng) {
//    String weightArray = Arrays
//      .stream(strng.split(" "))
//      .sorted(Comparator
//        .comparing(Main::digitSum)
//        .thenComparing(String::valueOf))
//      .collect(Collectors.joining(" "));
//    return weightArray;
//  }
//
//  public static int sequence(int[] arr) {
//    int maxSub = 0;
//    int runTotal = 0;
//    for (int i = 0; i < arr.length; i++){
//      runTotal = runTotal + arr[i];
//      if (runTotal > maxSub) {
//        maxSub = runTotal;
//      }
//      if (runTotal < 0) {
//        runTotal = 0;
//      }
//    }
//    return maxSub;
//
//  }
//
//
//  public static String[] dirReduc(String[] arr) {
//    // Your code here.
//    String joinedArray = Arrays.stream(arr).collect(Collectors.joining("-"));
//    String grepString = "(NORTH-SOUTH)|(SOUTH-NORTH)|(EAST-WEST)|(WEST-EAST)";
//    System.out.println(joinedArray);
//    while (joinedArray.replaceAll(grepString, "") != joinedArray) {
//      joinedArray = joinedArray
//        .replaceAll(grepString, "")
//        .replaceAll("--", "-");
//      System.out.println(joinedArray);
//    }
//    String output = joinedArray
//      .replaceAll("(^-)|(-$)", "");
//    output.length();
//    return output == "" ? new String[]{} : output.split("-");
//  }
//
//  public static boolean validParentheses(String parens)
//  {
//    String pReplaced = parens.replaceAll("[^\\(\\)]", "");
//    while (pReplaced.length() > 0 &&
//      pReplaced.replaceAll("\\(\\)", "") != pReplaced){
//      pReplaced = pReplaced.replaceAll("\\(\\)", "");
//    }
//    return pReplaced.length() == 0;
//  }
//
//  public static long findNb(long m) {
//    System.out.println(m);
//    long output = -1;
//    long i = (long) Math.pow(m, 0.25);
//    long cubeSum;
//    do {
//      cubeSum = ((i) * (i + 1)/2) * ((i) * (i + 1)/2);
//      if (cubeSum == m) output = i;
//      i++;
//    } while (cubeSum < m);
//    return output;
//  }
//
//
//  public static int solveSuperMarketQueue(int[] customers, int n) {
//    int totalTime = 0;
//    List<Integer> customerList = Arrays.stream(customers)
//      .boxed()
//      .collect(Collectors.toList());
//    int minIndex;
//    int minVal;
//    while (customerList.size() > n) {
//      minVal = Collections.min(customerList.subList(0, n));
//      totalTime += minVal;
//      minIndex = customerList.indexOf(minVal);
//      customerList.remove(minIndex);
//      for (int i = 0; i < n - 1; i++) {
//        customerList.set(i, customerList.get(i) - minVal);
//      }
//    }
//    if (customerList.size() > 0) totalTime += Collections.max(customerList);
//    return totalTime;
//  }

//  public static String Tickets(int[] peopleInLine) {
//    System.out.println("==========");
//    System.out.println(Arrays.toString(peopleInLine));
//
//    List<Integer> moneyInHand = new ArrayList<>();
//
//    for (int i = 0; i < peopleInLine.length; i++) {
//      System.out.println(Arrays.toString(moneyInHand.toArray()));
//      if (peopleInLine[i] == 25) {
//        moneyInHand.add(25);
//      } else {
//        int moneyToGiveBack = peopleInLine[i] - 25;
//        if (moneyToGiveBack == 25){
//          int moneyIndex = moneyInHand.indexOf(25);
//          if (moneyIndex == -1) {
//            return "NO";
//          }
//          moneyInHand.remove(moneyIndex);
//          moneyInHand.add(50);
//        } else {
//          int moneyIndex50 = moneyInHand.indexOf(50);
//          if (moneyIndex50 == -1) {
//            int moneyIndex25 = moneyInHand.indexOf(25);
//            if (moneyIndex25 == -1) {
//              return "NO";
//            }
//            moneyInHand.remove(moneyIndex25);
//            moneyIndex25 = moneyInHand.indexOf(25);
//            if (moneyIndex25 == -1) {
//              return "NO";
//            }
//            moneyInHand.remove(moneyIndex25);
//          } else {
//            moneyInHand.remove(moneyIndex50);
//          }
//          int moneyIndex25 = moneyInHand.indexOf(25);
//          if (moneyIndex25 == -1) {
//            return "NO";
//          }
//          moneyInHand.remove(moneyIndex25);
//          moneyInHand.add(100);
//        }
//
//      }
//    }
//    return "YES";
//  }
//
//  public static int findEvenIndex(int[] arr) {
//    int rightSum = Arrays.stream(arr).sum();
//    int leftSum = 0;
//    int i = 0;
//    while (i < arr.length && (rightSum - arr[i])  != leftSum) {
//      rightSum -= arr[i];
//      leftSum += arr[i];
//      i += 1;
//    }
//    if (i == arr.length) i = -1;
//    return i;
//  }
//
//  public static String makeReadable(int seconds) {
//    // Do something
//    int[] output = {0, 0, 0};
//    int i = 0;
//    while (seconds >= 1 & i < 2) {
//      output[i] = seconds % 60;
//      seconds = seconds/60;
//      i++;
//    }
//    output[i] = seconds;
//    return String.format("%02d:%02d:%02d",
//      output[2], output[1], output[0]);
//  }
//
//  public static long digPow(int n, int p) {
//    // your code
//    long sum = 0;
//    for(String c: String.valueOf(n).split("")){
//      sum += Math.pow(Long.parseLong(c), p);
//      p++;
//    }
//    return (sum % n == 0) ? (sum/n): -1;
//  }
//
//  static String toCamelCase(String s){
//    String sa[] = s.split("[-_]");
//    for (int i = 1; i < sa.length; i++){
//      String[] letterArray = sa[i].split("");
//      letterArray[0] = letterArray[0].toUpperCase();
//      sa[i] = String.join("", letterArray);
//    }
//    return String.join("", sa);
//  }
//
//  public static String order2(String words) {
//    return Arrays.stream(words.split(" "))
//      .sorted(Comparator.comparing(
//        s -> Integer.valueOf(s.replaceAll("\\D", ""))
//      ))
//      .reduce((a, b) -> a + " " + b).get();
//  }
//
//  public static String order(String words) {
//
//    if (words.equals("")){
//      return "";
//    }
//    int[] order = Arrays.stream(words
//      .replaceAll("[^\\d]", "")
//      .split(""))
//      .mapToInt(c -> Integer.parseInt(c) - 1)
//      .toArray();
//    String[] sa = new String[order.length];
//
//    for (int i = 0; i < order.length; i++) {
//      sa[order[i]] = words.split(" ")[i];
//    }
//
//    return String.join(" ", sa);
//  }
//
//  public static String SongDecoder (String song)
//  {
//    return(song.replaceAll("(WUB)+", " ").trim());
//  }
//
//  public static String createPhoneNumber(int[] numbers) {
//    return(String.format("(%s)", numbers[0]));
//  }
//
//  public static int[] arrayDiff(int[] a, int[] b) {
//    // Your code here
//    Set<Integer> hs = new HashSet<>();
//    for (int element :  b){
//      hs.add(element);
//    }
//    return(Arrays.stream(a)
//      .filter(x -> !hs.contains(x))
//      .toArray()
//    );
//  }
//
//  static int findOutlier(int[] integers){
//    boolean isOdd = Arrays.stream(Arrays.copyOfRange(integers, 0, 3))
//      .map(x -> Math.floorMod(x, 2)).sum() > 1;
//    return (Arrays.stream(integers)
//      .filter(x -> Math.floorMod(x, 2) == (isOdd ? 0: 1))
//      .findFirst()
//      .orElse(0));
//  }
//
//  public static int persistence(long n) {
//    int count = 0;
//    while (n > 9) {
//      n = String.valueOf(n)
//        .chars()
//        .mapToObj(s -> Integer.parseInt(String.valueOf(Character.getNumericValue(s))))
//        .reduce(1, (x, y) -> x * y);
//      count++;
//    }
//    return(count);
//  }
//
//
//  public static String whoLikesIt(String... names) {
//    String output = null;
//    if(names.length == 0) {
//      return("no one likes this");
//    }
//    if(names.length == 1) {
//      return(names[0] + " likes this");
//    }
//    if(names.length == 2) {
//      output = String.format("%s and %s", names[0], names[1]);
//    }
//    if(names.length == 3) {
//      output = String.format("%s, %s and %s", names[0], names[1], names[2]);
//    }
//    if(names.length > 3) {
//      output = String.format("%s, %s and %s others",
//        names[0], names[1], String.valueOf(names.length - 2));
//    }
//    return(output + " like this");
//  }
//
//  public String spinWords(String sentence) {
//    String[] splitS = sentence.split(" ");
//    String output = "";
//    for (String s: splitS) {
//      StringBuilder sb = new StringBuilder(s);
//      if (s.length() >= 5) {
//        sb.reverse();
//      }
//      output += " " + sb;
//    }
//    return output.replaceAll("^\s", "");
//  }
//
//  public static int sumOfDigits(int n) {
//    int output = 0;
//    while (n > 0) {
//      output += n % 10;
//      n /= 10;
//    }
//    return(output);
//  }
//
//  public static int digital_root(int n) {
//    do  {
//      n = sumOfDigits(n);
//    } while (n > 10);
//    return n;
//  }
//
//  public static String getMiddle(String word) {
//    //Code goes here!
//    int wordLength = word.length();
//    char[] ca = word.toCharArray();
//    String output;
//    if (wordLength % 2 == 0) {
//      output = String.valueOf(ca[(wordLength /2) -1]) +
//        String.valueOf(ca[(wordLength /2)]);
//    } else {
//      output = String.valueOf(ca[((wordLength - 1) /2)]) ;
//    }
//    return(output);
//  }
//
//
//  public int squareDigits(int n) {
//    return(Integer.parseInt(String.valueOf(n)
//      .chars()
//      .mapToObj(s -> String.valueOf(Character.getNumericValue(s)))
//      .map(n1 -> String.valueOf((int) Math.pow(Integer.parseInt(n1), 2)))
//      .collect(Collectors.joining())));
//
//  }

}

