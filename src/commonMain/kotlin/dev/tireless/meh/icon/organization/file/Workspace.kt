// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Workspace: ImageVector
  get() {
    val current = _workspace
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Workspace",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 17 v8 H6 v-8z m0 -2 H6 a2 2 0 0 0 -2 2 v8 a2 2 0 0 0 2 2 h10 a2 2 0 0 0 2 -2 v-8 a2 2 0 0 0 -2 -2 m11 -9 v5 H17 V6z m0 -2 H17 a2 2 0 0 0 -2 2 v5 a2 2 0 0 0 2 2 h10 a2 2 0 0 0 2 -2 V6 a2 2 0 0 0 -2 -2 m0 13 v5 h-5 v-5z m0 -2 h-5 a2 2 0 0 0 -2 2 v5 a2 2 0 0 0 2 2 h5 a2 2 0 0 0 2 -2 v-5 a2 2 0 0 0 -2 -2 M11 6 v5 H6 V6z m0 -2 H6 a2 2 0 0 0 -2 2 v5 a2 2 0 0 0 2 2 h5 a2 2 0 0 0 2 -2 V6 a2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 17
          moveTo(x = 16.0f, y = 17.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v -8z
          verticalLineToRelative(dy = -8.0f)
          close()
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
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
          // v -8
          verticalLineToRelative(dy = -8.0f)
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
          // m 11 -9
          moveToRelative(dx = 11.0f, dy = -9.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // H 17
          horizontalLineTo(x = 17.0f)
          // V 6z
          verticalLineTo(y = 6.0f)
          close()
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // H 17
          horizontalLineTo(x = 17.0f)
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
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
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
          // V 6
          verticalLineTo(y = 6.0f)
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
          // m 0 13
          moveToRelative(dx = 0.0f, dy = 13.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // v -5z
          verticalLineToRelative(dy = -5.0f)
          close()
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
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
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 5
          horizontalLineToRelative(dx = 5.0f)
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
          // v -5
          verticalLineToRelative(dy = -5.0f)
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
          // M 11 6
          moveTo(x = 11.0f, y = 6.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 6z
          verticalLineTo(y = 6.0f)
          close()
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 5
          horizontalLineToRelative(dx = 5.0f)
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
          // V 6
          verticalLineTo(y = 6.0f)
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
      .also { _workspace = it }
  }

@Suppress("ObjectPropertyName")
private var _workspace: ImageVector? = null
