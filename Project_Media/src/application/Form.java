package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class Form implements Initializable {
@FXML
private MediaView mv;

private Media md;
private MediaPlayer mp;
private File f;
private Stage s;

public void setStage(Stage stage) {
	stage = s;
}

@Override
public void initialize(URL arg0, ResourceBundle resources) {
	f = new File("C:\\Users\\David\\Videos\\rick.mp4");
	md = new Media(f.toURI().toString());
	mp = new MediaPlayer(md);
	mv.setMediaPlayer(mp);
}

	public void play() {
		mp.play();
	}
	
	public void pause() {
		mp.pause();
	}
	
	public void stop() {
		mp.stop();
	}

	public void open() {
		FileChooser fc = new FileChooser();
		fc.setTitle("Open Video File");
		ExtensionFilter ef = new ExtensionFilter("Media mp4", "*.mp4", "*.flv", "*.mkv", "*.avi", "*.mov", "*.wav");
		fc.getExtensionFilters().add(ef);
		f = fc.showOpenDialog(s);
		if (f != null) {
			md = new Media(f.toURI().toString());
			mp.stop();
			mp = new MediaPlayer(md);
			mv.setMediaPlayer(mp);
			play();
		}
	}
	
	@FXML
	public void close() {
	s.close();
	}
	
	
}
