// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BuildingInsights3: ImageVector
  get() {
    val current = _buildingInsights3
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.BuildingInsights3",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 2 H16 a2 2 0 0 0 -2 2 v10 H4 a2 2 0 0 0 -2 2 v14 h28 V4 a2 2 0 0 0 -2 -2 M9 28 v-7 h4 v7Z m19 0 H15 v-8 a1 1 0 0 0 -1 -1 H8 a1 1 0 0 0 -1 1 v8 H4 V16 h12 V4 h12Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 2
          moveTo(x = 28.0f, y = 2.0f)
          // H 16
          horizontalLineTo(x = 16.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // h 28
          horizontalLineToRelative(dx = 28.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // M 9 28
          moveTo(x = 9.0f, y = 28.0f)
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 7z
          verticalLineToRelative(dy = 7.0f)
          close()
          // m 19 0
          moveToRelative(dx = 19.0f, dy = 0.0f)
          // H 15
          horizontalLineTo(x = 15.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // H 8
          horizontalLineTo(x = 8.0f)
          // a 1 1 0 0 0 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 16
          verticalLineTo(y = 16.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 12z
          horizontalLineToRelative(dx = 12.0f)
          close()
        }
        // <rect width="2" height="2" x="18.0" y="8.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 8
          moveTo(x = 18.0f, y = 8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="2" x="24.0" y="8.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 8
          moveTo(x = 24.0f, y = 8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="2" x="18.0" y="14.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 14
          moveTo(x = 18.0f, y = 14.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="2" x="24.0" y="14.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 14
          moveTo(x = 24.0f, y = 14.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="2" x="18.0" y="20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 20
          moveTo(x = 18.0f, y = 20.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="2" x="24.0" y="20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 20
          moveTo(x = 24.0f, y = 20.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="5" height="2" x="2.0" y="10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 10
          moveTo(x = 2.0f, y = 10.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -5z
          horizontalLineToRelative(dx = -5.0f)
          close()
        }
        // <rect width="2" height="5" x="10.0" y="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 2
          moveTo(x = 10.0f, y = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="5" x="5.5" y="3.964" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 3.9996707 5.413884
          moveTo(x = 3.9996707f, y = 5.413884f)
          // l 1.4142135 -1.4142135
          lineToRelative(dx = 1.4142135f, dy = -1.4142135f)
          // l 3.535534 3.535534
          lineToRelative(dx = 3.535534f, dy = 3.535534f)
          // l -1.4142135 1.4142135z
          lineToRelative(dx = -1.4142135f, dy = 1.4142135f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 0 0
          moveTo(x = 0.0f, y = 0.0f)
          // h 32
          horizontalLineToRelative(dx = 32.0f)
          // v 32
          verticalLineToRelative(dy = 32.0f)
          // h -32z
          horizontalLineToRelative(dx = -32.0f)
          close()
        }
      }.build()
      .also { _buildingInsights3 = it }
  }

@Suppress("ObjectPropertyName")
private var _buildingInsights3: ImageVector? = null
