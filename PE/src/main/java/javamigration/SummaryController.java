package javamigration;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SummaryController {
	@Autowired
	private SummaryService summaryService;
	
	@RequestMapping("/summary")
	public List<Summary> getAllSummary()
	{
		return summaryService.getAllSummary();
	}
	
	@RequestMapping("summary/{id}")
	public Summary getSummary(@PathVariable String id)
	{
		return summaryService.getSummary(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/summary")
	public void addSummary(@RequestBody Summary summary)
	{
		summaryService.addSummary(summary);
	}

	@RequestMapping(method=RequestMethod.PUT, value = "/summary/{id}")
	public void updateSummary(@RequestBody Summary summary, @PathVariable String id)
	{
		summaryService.updateSummary(id,summary);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value = "/summary/{id}")
	public void deleteSummary(@PathVariable String id)
	{
		summaryService.deleteSummary(id);
	}
}
