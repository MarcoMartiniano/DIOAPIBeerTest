package marco.com.example.ApiBeer.mapper;


import marco.com.example.ApiBeer.dto.BeerDTO;
import marco.com.example.ApiBeer.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
