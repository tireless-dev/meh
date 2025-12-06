// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val StrategyPlay: ImageVector
  get() {
    val current = _strategyPlay
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.StrategyPlay",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="12.0 3.415 10.586 2.0 7.0 5.587 3.414 2.0 2.0 3.415 5.586 7.0 2.0 10.586 3.414 12.0 7.0 8.414 10.586 12.0 12.0 10.586 8.414 7.0 12.0 3.415" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 12 3.415
          moveTo(x = 12.0f, y = 3.415f)
          // L 10.586 2
          lineTo(x = 10.586f, y = 2.0f)
          // L 7 5.587
          lineTo(x = 7.0f, y = 5.587f)
          // L 3.414 2
          lineTo(x = 3.414f, y = 2.0f)
          // L 2 3.415
          lineTo(x = 2.0f, y = 3.415f)
          // L 5.586 7
          lineTo(x = 5.586f, y = 7.0f)
          // L 2 10.586
          lineTo(x = 2.0f, y = 10.586f)
          // L 3.414 12
          lineTo(x = 3.414f, y = 12.0f)
          // L 7 8.414
          lineTo(x = 7.0f, y = 8.414f)
          // L 10.586 12
          lineTo(x = 10.586f, y = 12.0f)
          // L 12 10.586
          lineTo(x = 12.0f, y = 10.586f)
          // L 8.414 7
          lineTo(x = 8.414f, y = 7.0f)
          // L 12 3.415z
          lineTo(x = 12.0f, y = 3.415f)
          close()
        }
        // m25 2 -5 5 1.4 1.42 L24 5.79 V15 H8 a2 2 0 0 0 -2 2 v3.1 a5 5 0 1 0 2 0 V17 h16 a2 2 0 0 0 2 -2 V5.85 l2.6 2.57 L30 7z M10 25 a3 3 0 1 1 -6 0 3 3 0 0 1 6 0
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 2
          moveTo(x = 25.0f, y = 2.0f)
          // l -5 5
          lineToRelative(dx = -5.0f, dy = 5.0f)
          // l 1.4 1.42
          lineToRelative(dx = 1.4f, dy = 1.42f)
          // L 24 5.79
          lineTo(x = 24.0f, y = 5.79f)
          // V 15
          verticalLineTo(y = 15.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
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
          // v 3.1
          verticalLineToRelative(dy = 3.1f)
          // a 5 5 0 1 0 2 0
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // V 17
          verticalLineTo(y = 17.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // V 5.85
          verticalLineTo(y = 5.85f)
          // l 2.6 2.57
          lineToRelative(dx = 2.6f, dy = 2.57f)
          // L 30 7z
          lineTo(x = 30.0f, y = 7.0f)
          close()
          // M 10 25
          moveTo(x = 10.0f, y = 25.0f)
          // a 3 3 0 1 1 -6 0
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -6.0f,
            dy1 = 0.0f,
          )
          // a 3 3 0 0 1 6 0
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 6.0f,
            dy1 = 0.0f,
          )
        }
        // <polygon points="30.0 21.415 28.586 20.0 25.0 23.587 21.414 20.0 20.0 21.415 23.586 25.0 20.0 28.586 21.414 30.0 25.0 26.414 28.586 30.0 30.0 28.586 26.414 25.0 30.0 21.415" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 30 21.415
          moveTo(x = 30.0f, y = 21.415f)
          // L 28.586 20
          lineTo(x = 28.586f, y = 20.0f)
          // L 25 23.587
          lineTo(x = 25.0f, y = 23.587f)
          // L 21.414 20
          lineTo(x = 21.414f, y = 20.0f)
          // L 20 21.415
          lineTo(x = 20.0f, y = 21.415f)
          // L 23.586 25
          lineTo(x = 23.586f, y = 25.0f)
          // L 20 28.586
          lineTo(x = 20.0f, y = 28.586f)
          // L 21.414 30
          lineTo(x = 21.414f, y = 30.0f)
          // L 25 26.414
          lineTo(x = 25.0f, y = 26.414f)
          // L 28.586 30
          lineTo(x = 28.586f, y = 30.0f)
          // L 30 28.586
          lineTo(x = 30.0f, y = 28.586f)
          // L 26.414 25
          lineTo(x = 26.414f, y = 25.0f)
          // L 30 21.415z
          lineTo(x = 30.0f, y = 21.415f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
        path(
          fill = SolidColor(Color.Transparent),
          strokeLineWidth = 0.0f,
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
      .also { _strategyPlay = it }
  }

@Suppress("ObjectPropertyName")
private var _strategyPlay: ImageVector? = null
