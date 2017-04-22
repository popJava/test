public interface Sorter{

public <T extends Comparable<T>> void Sort(T[] list);

public <T> void sort(T[] list,Comparator<T> comp);

}
/*BubbleSorter*/
public class BubbleSorter implements Sorter {
@Override
public <T extends Comparable<T>> void sort(T[] list){
	boolean swapped = true;
	for(int i=1,len=list.length;i<len && swapped;++i){
		swapped = false;
		for(int j=0;j<len-i;++j){
			if(list[j].comparedTo(list[j+1])>0){
				T temp = list[j];
				list[j]=list[j+1];
				list[j+1]=temp;
				swapped = true;
			}
		}
	}
	//此处根据情况遍历输出排序后的数组
}

@Override
public <T> void sort(T[] list,Comparator<T> comp){
	boolean swapped = true;
	for(int i=1,len=list.length;i<len && swapped;++i){
		swapped = false;
		for(int j=0;j<len-i;++j){
			if(comp.compare(list[j],list[j+1])>0){
				T temp = list[j];
				list[j] = list[j+1];
				list[j+1] = temp;
				swapped = true;
			}
		}
	}
}
}
