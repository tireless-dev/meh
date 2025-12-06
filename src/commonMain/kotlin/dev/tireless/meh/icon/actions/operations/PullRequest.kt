// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PullRequest: ImageVector
  get() {
    val current = _pullRequest
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PullRequest",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M25 22.14 V9 a4 4 0 0 0 -4 -4 h-4.17 l2.58 -2.59 L18 1 l-5 5 5 5 1.41 -1.41 L16.83 7 H21 a2 2 0 0 1 2 2 v13.14 a4 4 0 1 0 2 0 M24 28 a2 2 0 1 1 0 -4 2 2 0 0 1 0 4 M4 6 a4 4 0 0 0 3 3.86 v12.28 a4 4 0 1 0 2 0 V9.86 A4 4 0 1 0 4 6 m6 20 a2 2 0 1 1 -4 0 2 2 0 0 1 4 0 m0 -20 a2 2 0 1 1 -4 0 2 2 0 0 1 4 0
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 22.14
          moveTo(x = 25.0f, y = 22.14f)
          // V 9
          verticalLineTo(y = 9.0f)
          // a 4 4 0 0 0 -4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.0f,
            dy1 = -4.0f,
          )
          // h -4.17
          horizontalLineToRelative(dx = -4.17f)
          // l 2.58 -2.59
          lineToRelative(dx = 2.58f, dy = -2.59f)
          // L 18 1
          lineTo(x = 18.0f, y = 1.0f)
          // l -5 5
          lineToRelative(dx = -5.0f, dy = 5.0f)
          // l 5 5
          lineToRelative(dx = 5.0f, dy = 5.0f)
          // l 1.41 -1.41
          lineToRelative(dx = 1.41f, dy = -1.41f)
          // L 16.83 7
          lineTo(x = 16.83f, y = 7.0f)
          // H 21
          horizontalLineTo(x = 21.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 13.14
          verticalLineToRelative(dy = 13.14f)
          // a 4 4 0 1 0 2 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // M 24 28
          moveTo(x = 24.0f, y = 28.0f)
          // a 2 2 0 1 1 0 -4
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -4.0f,
          )
          // a 2 2 0 0 1 0 4
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 4.0f,
          )
          // M 4 6
          moveTo(x = 4.0f, y = 6.0f)
          // a 4 4 0 0 0 3 3.86
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.0f,
            dy1 = 3.86f,
          )
          // v 12.28
          verticalLineToRelative(dy = 12.28f)
          // a 4 4 0 1 0 2 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // V 9.86
          verticalLineTo(y = 9.86f)
          // A 4 4 0 1 0 4 6
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 4.0f,
            y1 = 6.0f,
          )
          // m 6 20
          moveToRelative(dx = 6.0f, dy = 20.0f)
          // a 2 2 0 1 1 -4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 0.0f,
          )
          // a 2 2 0 0 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // m 0 -20
          moveToRelative(dx = 0.0f, dy = -20.0f)
          // a 2 2 0 1 1 -4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 0.0f,
          )
          // a 2 2 0 0 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
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
      .also { _pullRequest = it }
  }

@Suppress("ObjectPropertyName")
private var _pullRequest: ImageVector? = null
