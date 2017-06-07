package me.itangqi.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import me.itangqi.greendao.Note;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table NOTE.
*/
public class NoteDao extends AbstractDao<Note, Long> {

    public static final String TABLENAME = "NOTE";

    /**
     * Properties of entity Note.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Path = new Property(2, String.class, "path", false, "PATH");
        public final static Property State = new Property(3, Boolean.class, "state", false, "STATE");
        public final static Property Url = new Property(4, String.class, "url", false, "URL");
        public final static Property Contentid = new Property(5, String.class, "contentid", false, "CONTENTID");
    };


    public NoteDao(DaoConfig config) {
        super(config);
    }
    
    public NoteDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'NOTE' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'NAME' TEXT NOT NULL ," + // 1: name
                "'PATH' TEXT," + // 2: path
                "'STATE' INTEGER," + // 3: state
                "'URL' TEXT," + // 4: url
                "'CONTENTID' TEXT);"); // 5: contentid
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'NOTE'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Note entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getName());
 
        String path = entity.getPath();
        if (path != null) {
            stmt.bindString(3, path);
        }
 
        Boolean state = entity.getState();
        if (state != null) {
            stmt.bindLong(4, state ? 1l: 0l);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(5, url);
        }
 
        String contentid = entity.getContentid();
        if (contentid != null) {
            stmt.bindString(6, contentid);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Note readEntity(Cursor cursor, int offset) {
        Note entity = new Note( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // path
            cursor.isNull(offset + 3) ? null : cursor.getShort(offset + 3) != 0, // state
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // url
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // contentid
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Note entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.getString(offset + 1));
        entity.setPath(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setState(cursor.isNull(offset + 3) ? null : cursor.getShort(offset + 3) != 0);
        entity.setUrl(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setContentid(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Note entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Note entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
