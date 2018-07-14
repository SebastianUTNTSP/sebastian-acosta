import java.util.ArrayList;

public class Service {
	public ArrayList<File> recentFiles = new ArrayList<File>();

	public Service() {

	}

	public void addRecentList(File file) {

		if (recentFiles.size() < 15 || recentFiles.contains(file)) {

			if (recentFiles.isEmpty()) {
				recentFiles.add(file);
			} else if (recentFiles.contains(file)) {
				recentFiles.remove(file);
				recentFiles.add(0, file);
			} else
				recentFiles.add(file);
		} else {
			recentFiles.remove(0);
			recentFiles.add(file);

		}
	}

	public void printList() {

		for (File e : recentFiles) {
			System.out.println(e.getName());
		}
	}

	public ArrayList<File> getRecentFiles() {
		return recentFiles;
	}

	public int getSize() {
		return recentFiles.size();
	}

	public boolean empty() {
		return recentFiles.isEmpty();
	}

	public void setRecentFiles(ArrayList<File> recentFiles) {
		recentFiles = recentFiles;
	}
}
