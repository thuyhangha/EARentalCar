package ea.project.repository;

import java.util.List;

public interface dao<E,I> {
    List<E> getList();

    E getOneById(I id);

    void add(E domain);

    void edit(E domain);

    void delete(E domain);
}
