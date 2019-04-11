package javamigration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SummaryService {
	private List<Summary> summary = new ArrayList<>(Arrays.asList(
			new Summary("0000000000001","MENDOZA,RENETTE SIGUA","BICYCLE POKER"),
			new Summary("0000000000002","DAMASCO,JHUN","KFC"),
			new Summary("0000000000003","SANTOS,ALVIN TOLEDO","WALK-IN")
			));
	
	public List<Summary> getAllSummary()
	{
		return summary;
	}
	
	public Summary getSummary(String id)
	{
		return summary.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addSummary(Summary summ)
	{
		summary.add(summ);
	}
	
	public void updateSummary(String id, Summary summ)
	{
		for(int i = 0; i<summary.size(); i++)
		{
			Summary t = summary.get(i);
			if(t.getId().equals(id))
			{
				summary.set(i, summ);
				return;
			}
		}
	}

	public void deleteSummary(String id)
	{
		summary.removeIf(t -> t.getId().equals(id));
		
	}
}
