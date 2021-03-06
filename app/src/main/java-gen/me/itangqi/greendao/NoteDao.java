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
        public final static Property Issecret = new Property(4, Boolean.class, "issecret", false, "ISSECRET");
        public final static Property Url = new Property(5, String.class, "url", false, "URL");
        public final static Property Contentid = new Property(6, String.class, "contentid", false, "CONTENTID");
        public final static Property Date = new Property(7, String.class, "date", false, "DATE");
        public final static Property Type = new Property(8, Integer.class, "type", false, "TYPE");
        public final static Property Vodeosize = new Property(9, Long.class, "vodeosize", false, "VODEOSIZE");
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
                "'ISSECRET' INTEGER," + // 4: issecret
                "'URL' TEXT," + // 5: url
                "'CONTENTID' TEXT," + // 6: contentid
                "'DATE' TEXT," + // 7: date
                "'TYPE' INTEGER," + // 8: type
                "'VODEOSIZE' INTEGER);"); // 9: vodeosize
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
 
        Boolean issecret = entity.getIssecret();
        if (issecret != null) {
            stmt.bindLong(5, issecret ? 1l: 0l);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(6, url);
        }
 
        String contentid = entity.getContentid();
        if (contentid != null) {
            stmt.bindString(7, contentid);
        }
 
        String date = entity.getDate();
        if (date != null) {
            stmt.bindString(8, date);
        }
 
        Integer type = entity.getType();
        if (type != null) {
            stmt.bindLong(9, type);
        }
 
        Long vodeosize = entity.getVodeosize();
        if (vodeosize != null) {
            stmt.bindLong(10, vodeosize);
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
            cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0, // issecret
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // url
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // contentid
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // date
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // type
            cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9) // vodeosize
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
        entity.setIssecret(cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0);
        entity.setUrl(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setContentid(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setDate(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setType(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setVodeosize(cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9));
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
