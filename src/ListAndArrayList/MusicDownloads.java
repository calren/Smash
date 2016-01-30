package ListAndArrayList;

import java.util.List;
import java.util.ArrayList;


public class MusicDownloads
{
  /** The list of downloaded information.
   *  Guaranteed not to be null and not to contain duplicate titles.
   */
  private List<DownloadInfo> downloadList;

  /** Creates the list of downloaded information. */
  public MusicDownloads()
  { 
  	downloadList = new ArrayList<DownloadInfo>(); 
  }

  // Part (a)

  /** Returns a reference to the DownloadInfo object with the requested title if
   *  it exists.
   *  @param title the requested title
   *  @return a reference to the DownloadInfo object with the
   *          title that matches the parameter title if it exists in the list;
   *          null otherwise.
   *  Postcondition:
   *   - no changes were made to downloadList.
   */
  public DownloadInfo getDownloadInfo(String title)
  {
  	// Part (a) solution goes here.
        
    return null;
  }

  // Part (b)

  /** Updates downloadList with information from titles.
   * @param titles a list of song titles
   * Postcondition:
   *  - there are no duplicate titles in downloadList.
   *  - no entries were removed from downloadList.
   *  - all songs in titles are represented in downloadList.
   *  - for each existing entry in downloadList, the download count is increased by
   *       the number of times its title appeared in titles.
   *  - the order of the existing entries in downloadList is not changed.
   *  - the first time an object with a title from titles is added to downloadList, it
   *       is added to the end of the list.
   *  - new entries in downloadList appear in the same order
   *       in which they first appear in titles.
   *  - for each new entry in downloadList, the download count is equal to
   *       the number of times its title appeared in titles.
   */
  public void updateDownloads(List<String> titles)
  {
    // Part (b) solution goes here.
  }

  /*******************************************************************************/

  public static void main(String[] args)
  {
    DownloadInfo di;
    MusicDownloads test = new MusicDownloads();
    test.downloadList.add(new DownloadInfo("Hey Jude"));
    di = test.getDownloadInfo("Hey Jude");
    di.incrementTimesDownloaded();
    di.incrementTimesDownloaded();
    di.incrementTimesDownloaded();
    di.incrementTimesDownloaded();
    test.downloadList.add(new DownloadInfo("Soul Sister"));
    di = test.getDownloadInfo("Soul Sister");
    di.incrementTimesDownloaded();
    di.incrementTimesDownloaded();
    test.downloadList.add(new DownloadInfo("Aqualung"));
    di = test.getDownloadInfo("Aqualung");
    di.incrementTimesDownloaded();
    di.incrementTimesDownloaded();
    di.incrementTimesDownloaded();
    di.incrementTimesDownloaded();
    di.incrementTimesDownloaded();
    di.incrementTimesDownloaded();
    di.incrementTimesDownloaded();
    di.incrementTimesDownloaded();
    di.incrementTimesDownloaded();
    System.out.println(test.downloadList);
    
    List<String> titles = new ArrayList<String>();
    
    titles.add("Lights");
    titles.add("Aqualung");
    titles.add("Soul Sister");
    titles.add("Go Now");
    titles.add("Lights");
    titles.add("Soul Sister");
    
    test.updateDownloads(titles);
    System.out.println(test.downloadList);
  }
}

/*  EXPECTED OUTPUT
[Hey Jude 5, Soul Sister 3, Aqualung 10]
[Hey Jude 5, Soul Sister 5, Aqualung 11, Lights 2, Go Now 1]
*/
