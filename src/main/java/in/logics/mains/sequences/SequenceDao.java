package in.logics.mains.sequences;

public interface SequenceDao {
	long getNextSequenceId(String key) throws Exception;
}
