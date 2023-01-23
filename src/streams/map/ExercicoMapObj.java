package streams.map;

import streams.Cachorro;
import streams.CachorroDto;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ExercicoMapObj {
    public static void main(String[] args) {

        Cachorro luna = new Cachorro("luna", "femea", 5);
        Cachorro stark = new Cachorro("stark", "macho", 4);
        Cachorro tunico = new Cachorro("tunicao", "macho", 7);
        Cachorro nina = new Cachorro("nina", "femea", 8);

        List<Cachorro> cachorros = Arrays.asList(luna, stark, tunico, nina);

        // Recebe um Cachorro T, e retorna um CachorroDto R
        Function<Cachorro, CachorroDto> outroCachorro = e -> {
            CachorroDto cachorroDto = new CachorroDto();
            cachorroDto.setNome(e.getNome());
            cachorroDto.setSexo(e.getSexo());
            return cachorroDto;
        };

        // Recebe um CachorroDto T, e retorna uma String R
        Function<CachorroDto, String> nomeCachorro = n -> n.getNome();

        cachorros.stream()
                .map(outroCachorro)
                .map(nomeCachorro)
                .forEach(System.out::println);
    }
}
