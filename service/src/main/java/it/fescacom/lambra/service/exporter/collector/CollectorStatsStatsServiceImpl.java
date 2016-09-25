package it.fescacom.lambra.service.exporter.collector;

import it.fescacom.lambra.domain.TeamStats;
import it.fescacom.lambra.repository.web.TeamStatsRepositoryWebImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by scanufe on 21/09/16.
 */
@Service
public class CollectorStatsStatsServiceImpl implements CollectorStatsService {
    private final TeamStatsRepositoryWebImpl teamStatsRepository;

    @Autowired
    public CollectorStatsStatsServiceImpl(TeamStatsRepositoryWebImpl teamStatsRepository) {
        this.teamStatsRepository = teamStatsRepository;
    }

    public List<TeamStats> collectTeamStatsByRound(int round) {

        return teamStatsRepository.findAllTeamStats(round);
    }
}
