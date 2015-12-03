package com.kickstarter.viewmodels.outputs;

import android.util.Pair;

import com.kickstarter.models.Empty;
import com.kickstarter.models.Project;
import com.kickstarter.services.DiscoveryParams;

import java.util.List;

import rx.Observable;

public interface SearchViewModelOutputs {
  Observable<Empty> clearData();
  Observable<Pair<DiscoveryParams, List<Project>>> newData();
}