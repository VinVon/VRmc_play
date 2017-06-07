package vr.xinjing.com.vrmc.utils;

/**
 * Created by raytine on 2017/3/4.
 */

import android.content.Context;

import java.util.List;

import me.itangqi.greendao.DaoMaster;
import me.itangqi.greendao.DaoSession;
import me.itangqi.greendao.Note;
import me.itangqi.greendao.NoteDao;
import vr.xinjing.com.vrmc.imp.NoteDaoService;

/**
 * Created by raytine on 2017/2/27.
 */

public class NoteService implements NoteDaoService {
    private DaoMaster daoMaster;
    private static DaoSession daoSession;
    private static NoteService noteService;
    private NoteDao noteDao;
    public  NoteService(NoteDao noteDao){
        this.noteDao =noteDao;
    }
    public static NoteDao getNoteDao11(){
        return daoSession.getNoteDao();
    }
    public  static NoteService getNoteService(Context context){
        if (noteService == null){
            daoSession = NoteGreenDao.getDaoSession(context);
            noteService = new NoteService(daoSession.getNoteDao());
        }
        return  noteService;
    }
    @Override
    public Note insertNote(Note note) {

        return noteDao.loadByRowId(noteDao.insertOrReplace(note));
    }

    @Override
    public void deleteNote(long id) {
        noteDao.deleteByKey(id);
    }

    @Override
    public Note getNoteById(long id) {
        return noteDao.queryBuilder().where(NoteDao.Properties.Id.eq(id)).unique();
    }

    @Override
    public Note getNoteByText(String text) {
        return noteDao.queryBuilder().where(NoteDao.Properties.Name.eq(text)).unique();
    }

    @Override
    public boolean isExist(String name) {
        Note unique = noteDao.queryBuilder().where(NoteDao.Properties.Name.eq(name)).unique();

        if (unique ==null){
            return  false;
        }else{
            return true;
        }
    }

    @Override
    public void updateData(String name ,Note n) {
        Note noteByText = getNoteByText(name);
        long id = noteByText.getId();
        n.setId(id);
        noteDao.update(n);
    }

    @Override
    public Note getNameById(String contentid) {
        Note unique = noteDao.queryBuilder().where(NoteDao.Properties.Contentid.eq(contentid)).unique();
        if (unique !=null){
            return  unique;
        }
        return null;
    }

    public NoteDao getCarsDao() {
        return noteDao;
    }

    public List<Note> getAll() {
        return noteDao.loadAll();
    }
}

