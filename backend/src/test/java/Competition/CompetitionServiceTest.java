//package Competition;//package com.nology.backend;
////
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.mockito.ArgumentMatchers.anyLong;
//
//import static org.mockito.Mockito.when;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//
//@ExtendWith(MockitoExtension.class)
//class CompetitionControllerTest {
//
//    @InjectMocks
//    private CompetitionController competitionController;
//
//
//    //Mocking refers to the development of objects which are a mock or clone of real objects. In the technique, it uses mock objects instead of real objects for testing. As a result, a mock object provides a specific mock output for each mock input passed.
//    @Mock
//    private CompetitionService competitionService;
//
//    private Competition competition;
//
//    @BeforeEach
//    void setUp() {
//        competition = new Competition(1L, "Test Competition", "Test Description");
//    }
//
////    @Test
////    CompetitionControllerTest() {
////        when(competitionService.addCompetition(competition)).thenReturn(competition);
////
////        Competition result = competitionController.createCompetition(competition);
////
////        assertThat(result).isNotNull();
////        assertThat(result.getId()).isEqualTo(1L);
////        assertThat(result.getCompName()).isEqualTo("Test Competition");
////
////    }
//
//    @Test
//    void testGetCompetition() {
//        List<Competition> competitions = new ArrayList<>();
//        competitions.add(competition);
//        when(competitionService.getAllCompetitions()).thenReturn(competitions);
//
//        List<Competition> result = competitionController.getCompetition();
//
//        assertThat(result).isNotNull();
//        assertThat(result.size()).isEqualTo(1);
//        assertThat(result.get(0).getId()).isEqualTo(1L);
//        assertThat(result.get(0).getCompName()).isEqualTo("Test Competition");
//
//    }
//
//    @Test
//    void testGetRandomCompetition() {
//        when(competitionService.getRandomCompetition()).thenReturn(competition);
//
//        Competition result = competitionController.getRandomCompetition();
//
//        assertThat(result).isNotNull();
//        assertThat(result.getId()).isEqualTo(1L);
//        assertThat(result.getCompName()).isEqualTo("Test Competition");
//    }
//
//    @Test
//    void testGetCompetitionById() {
//        when(competitionService.getCompetitionById(1)).thenReturn(Optional.of(competition));
//
//        Optional<Competition> result = competitionController.getCompetitionById(1);
//
//        assertThat(result).isNotNull();
//        assertThat(result.isPresent()).isTrue();
//        assertThat(result.get().getId()).isEqualTo(1L);
//        assertThat(result.get().getCompName()).isEqualTo("Test Competition");
//    }
//
//    @Test
//    void testGetCompetitionByIdNotFound() {
//        when(competitionService.getCompetitionById(anyLong())).thenThrow(CompetitionNotFoundException.class);
//
//        assertThrows(CompetitionNotFoundException.class, () -> competitionController.getCompetitionById(1L));
//    }
//}
