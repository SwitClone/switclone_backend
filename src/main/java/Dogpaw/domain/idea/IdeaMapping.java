package Dogpaw.domain.idea;

import Dogpaw.domain.UploadFile;
import Dogpaw.domain.User;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface IdeaMapping {
    User getUser();
    String getText();
    LocalDate getDate();
    LocalTime getTime();
    List<UploadFile> getFileList();
}