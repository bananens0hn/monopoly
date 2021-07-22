package musterlösung;

public class Test {
public static void main(String args[]) {
	Rangierbahnhof bRangierbahnhof=new Rangierbahnhof(3);
	bRangierbahnhof.WaggonEinfuegen(new Waggon("münchen", 1), 1);
	bRangierbahnhof.WaggonEinfuegen(new Waggon("QAugsburg", 0), 0);
	bRangierbahnhof.WaggonEinfuegen(new Waggon("Hamburg", 2), 2);
	bRangierbahnhof.WaggonEinfuegen(new Waggon("Unterhaching", 0	), 0);
	bRangierbahnhof.WaggonVerschieben(2, 0);
	bRangierbahnhof.informationenDrucken();
}
}
